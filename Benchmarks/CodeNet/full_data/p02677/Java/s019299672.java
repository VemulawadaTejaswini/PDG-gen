import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        double c =0;
        double angb = (m*360)/60;
        
        double anga = (h*60+m)*360/(12*60);
        //System.out.println(anga);
        //System.out.println(angb);
        double ans =0;

        double ang = Math.abs(angb-anga);
        
        double ang2 = Math.min(ang,360-ang);
        //System.out.println(ang);
        //System.out.println(ang2);

        c=(a*a)+(b*b)-2*a*b*Math.cos(ang2*(Math.PI/180));
        ans = Math.sqrt(c);
        System.out.println(ans);
        




    }
}