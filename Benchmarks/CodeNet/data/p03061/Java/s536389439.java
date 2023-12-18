import java.util.Scanner;

public class Main {

    static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] g = new int[n];
        int[] g2 = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if(i != 0) g[i] = gcd(g[i - 1], a[i]);
            else g[i] = a[i];
        }
        g2[n - 1] = a[n - 1];
        for(int i = n - 2; i >= 0; i--){
            g2[i] = gcd(g2[i + 1], a[i]);
        }
//        for(int i = 0; i < n; i++){
//            System.out.print(g2[i] + " ");
//        }
        int ans = Math.max(g2[1], g[n - 2]);
        for(int i = 1; i < n - 1; i++){
            int to = gcd(g[i - 1], g2[i + 1]);
            ans = Math.max(ans, to);
        }
        System.out.print(ans);
    }
}
