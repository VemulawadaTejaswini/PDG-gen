import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        int res = 0;
        for (int a = k; a <= n; a++) {
            for (int b = 1; b < a; b++) {
                if (a % b >= k) {
                    res++;
                }
            }
            res += n - a;
        }

        System.out.println(res);
    }
}
