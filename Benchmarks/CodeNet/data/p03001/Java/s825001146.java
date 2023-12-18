import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        double max,max2;
        int opt=0;

        double m1,m2,m3,m4;
        m1 = x*H;
        m2 = (W-x)*H;
        if(m2>m1)max=m1;
        else max=m2;
        m3 = W*y;
        m4 = (H-y)*W;
        if(m3>m4) max2=m4;
        else max2=m3;
        if(max>max2) System.out.println(max+" "+0);
        else if(max<max2)System.out.println(max2+" "+0);
        else if(max==max2) System.out.println(max+" "+1);
    }
}
