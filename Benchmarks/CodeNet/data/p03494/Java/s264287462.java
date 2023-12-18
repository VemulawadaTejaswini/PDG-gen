import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] ary = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(sc.next());
        }
        int ans = 0;
        a:while (true) {
            for (int i = 0; i < n; i++) {
                if (ary[i] % 2 != 0) {
                    break a;
                }
                ary[i] /= 2;
            }
            ans++;
        }
        System.out.println(ans);
    }
}
