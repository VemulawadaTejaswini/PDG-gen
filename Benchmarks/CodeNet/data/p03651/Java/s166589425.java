import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int gcd = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] > max)
                max = a[i];
            if (a[i] < min)
                min = a[i];
            if (a[i] == k) {
                System.out.print("POSSIBLE");
                return;
            }
            if(i==0){
                gcd = a[0];
            }else{
                gcd = gcd(a[i], gcd);
            }
            if (gcd < min)
                min = gcd;
            if (k < max && k%gcd == 0) {
                System.out.print("POSSIBLE");
                return;
            }
        }
        sc.close();
        System.out.print("IMPOSSIBLE");
    }

    public static int gcd(int a, int b) {
        int r = 1;
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        while (b > 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}