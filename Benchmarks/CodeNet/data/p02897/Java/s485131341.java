import java.util.*;
import java.lang.Math;

class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double tmp = Math.ceil(n/2);
        double ans = tmp/n;
        System.out.println(ans);
    }
}