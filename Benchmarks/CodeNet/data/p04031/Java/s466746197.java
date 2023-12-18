import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] ary = new int[n];
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            sum += a;
            ary[i] = a;
        }
        sum = (int) Math.round(sum / (n * 1.0));
        for (int i = 0; i < n; i++) {
            ans += Math.pow(sum - ary[i], 2);
        }
        System.out.println(ans);
    }
}