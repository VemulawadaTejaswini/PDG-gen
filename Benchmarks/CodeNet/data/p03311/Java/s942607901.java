import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long sum = 0;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        sc.close();
        long s = (sum - (long)(n+1)*(long)(n+2)/2) / n;
        long l = s + 1;
        long ss = s - 1;

        long ans1 = 0, ans2 = 0, ans3 = 0;
        for(int i=0; i<n; i++){
            ans1 += Math.abs(a[i] - s - i - 1);
            ans2 += Math.abs(a[i] - l - i - 1);
            ans3 += Math.abs(a[i] - ss - i - 1);
        }
        System.out.println(Math.min(Math.min(ans1, ans2), ans3));
    }
}