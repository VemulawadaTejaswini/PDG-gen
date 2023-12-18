import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+2];
        int[] c = new int[n+2];
        long tc = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            c[i] = Math.abs(a[i] - a[i-1]);
            tc += c[i];
        }
        tc += Math.abs(a[n]);
        
        for (int i = 1; i <= n; i++) {
            int c2 = Math.abs(a[i] - a[i+1]);
            int c3 = Math.abs(a[i-1] - a[i+1]);
            System.out.println(tc - c[i] - c2 + c3);
        }
    }
}
