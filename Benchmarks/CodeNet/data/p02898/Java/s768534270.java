import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] ary = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(sc.next());
        }
        int ans = 0;
        for (int a : ary) {
            if (a - k >= 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}