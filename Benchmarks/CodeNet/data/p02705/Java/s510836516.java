import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static int mod = 1000000007;

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();

        System.out.println(2 * R * Math.PI);

    }

}







