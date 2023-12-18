import java.util.*;

public class Main {

    static final int MOD=1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        int c = sc.nextInt();
        double left = a+b+2*Math.sqrt(a*b);
        if(left<c) System.out.println("Yes");
        else System.out.println("No");
    }
}