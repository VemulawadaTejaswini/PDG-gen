import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int max = 0;
        int g = 0;
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            g = gcd(g, num);
            max = Math.max(max, num);
        }
//        System.out.println(g);
        if (k%g == 0 && max >= k)
            System.out.println("POSSIBLE");
        else
            System.out.println("IMPOSSIBLE");
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
