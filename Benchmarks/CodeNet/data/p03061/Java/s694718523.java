import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b){
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        if(n == 2){
            System.out.println(Math.max(ar[0], ar[1]));
            return;
        }
        int[] p1 = new int[n];
        int[] p2 = new int[n];
        p1[0] = ar[0];
        for (int i = 1; i < n; i++) {
            p1[i] = gcd(p1[i-1], ar[i]);
        }
        p2[ar.length - 1] = ar[ar.length - 1];
        for(int i = ar.length - 2; i >= 0; i--){
            p2[i] = gcd(p2[i + 1], ar[i]);
        }
        int result = Math.max(p1[ar.length - 2], p2[1]);
        for (int i = 1; i < ar.length - 1; i++) {
            result = Math.max(result, gcd(p1[i - 1], p2[i + 1]));
        }
        System.out.println(result);
    }
}