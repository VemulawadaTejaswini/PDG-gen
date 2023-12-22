import java.util.Scanner;

public class Main {
    static int c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = sc.nextInt(), m = sc.nextInt();
            if ((n | m) == 0)
                break;
            c=0;
            System.out.println(gcd(n, m)+" "+c);

        }
    }

    static int gcd(int a, int b) {
        c++;
        if(a<b) {
            int t=a;
            a=b;
            b=t;
        }
        return a % b == 0?b:gcd(a % b, b);
    }
}
