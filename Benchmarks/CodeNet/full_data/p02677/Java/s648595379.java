import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        double cr = (m*11/360 - h/6)*Math.PI;
        double ans = Math.sqrt(a*a+b*b-2*a*b*Math.cos(cr));
        System.out.println(ans);
    }
}