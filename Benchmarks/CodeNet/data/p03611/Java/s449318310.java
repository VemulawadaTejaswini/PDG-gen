import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[(int) Math.pow(10, 5)];
        for (int i = 0; i < n; i++) {
            int aa = Integer.parseInt(sc.next());
            a[aa]++;
        }
        int ans = 0;
        if (n == 1) {
            System.out.println(1);
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            int temp = 0;
            if (i != 0) {
                temp += a[i - 1];
            }
            temp += a[i];
            temp += a[i + 1];
            ans = Math.max(ans, temp);
        }
        System.out.println(ans);
    }
}