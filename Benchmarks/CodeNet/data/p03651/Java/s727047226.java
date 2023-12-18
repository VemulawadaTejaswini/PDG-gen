import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scan.nextInt();
        int max = 0;
        for (int num : a)
            max = Math.max(max, num);
        int g = calcGcd(a);
//        System.out.println(g);
        if (k%g == 0 && max >= k)
            System.out.println("POSSIBLE");
        else
            System.out.println("IMPOSSIBLE");
    }
    
    int calcGcd(int... params) {
        int length = params.length;
        int g = gcd(params[0], params[1]);
        for (int i = 1; i < length - 1; i++) {
            g = gcd(g, params[i + 1]);
        }
        return g;
    }
    
    int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
