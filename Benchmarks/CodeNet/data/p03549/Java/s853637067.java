import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        long ti = (n - m) * 100;
        ti += 1900 * m;
        ti *= (int)(Math.pow(2 , m));
        System.out.println(ti);
    }
}