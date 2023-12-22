import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        double ar = 30*h + m/2;
        double br = 6*m;
        double cr = ar - br;
        if(ar-br<0){
            cr *= -1;
        }
        if(cr>180){
            cr = 360 - cr;
        }
        double ans = Math.sqrt(a*a+b*b-2*a*b*Math.cos(Math.toRadians(cr)));
        System.out.println(ans);
    }
}