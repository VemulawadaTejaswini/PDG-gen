import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        double a = scn.nextInt();
        double b = scn.nextInt();
        double h = scn.nextInt();
        double m = scn.nextInt();

        double ans = 0;
        double hr = ((h*60)+m)/2;
        double mr = m*6;

        double r = Math.abs((hr-mr));

        if(h==0&&m==0){
            System.out.println(Math.abs(a-b));
        }else if((h==0&&m==30)||(h==6&&m==0)){
            System.out.println(a+b);
        }else{
            ans = (a*a)+(b*b)-(2*a*b*Math.cos(Math.toRadians(r)));
            System.out.println(Math.sqrt(ans));
        }

            scn.close();
    }
}
