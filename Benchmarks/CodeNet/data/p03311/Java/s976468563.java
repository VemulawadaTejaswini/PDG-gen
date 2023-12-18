import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long sum = 0;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt() - i - 1;
            sum += a[i];
        }
        long s = sum / n;
        long l = s + 1;

        long ans1 = 0, ans2 = 0;
        for(int i=0; i<n; i++){
            ans1 += Math.abs(a[i] - s);
            ans2 += Math.abs(a[i] - l);
        }
        System.out.println(Math.min(ans1, ans2));
    }
}