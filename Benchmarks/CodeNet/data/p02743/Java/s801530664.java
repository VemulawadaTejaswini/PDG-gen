import java.util.*;
import java.lang.Math;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        scan.close();
        double ans;

        ans = a + b + 2 * Math.sqrt(a * b);
        if(ans < c) System.out.println("Yes");
        else System.out.println("No");
    }
}