import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = Integer.parseInt(sc.next());
        String ans = "No";
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        if (N > 81) {
            ans = "No";
        } else {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (N == (a[i] * b[j])) {
                        ans = "Yes";
                    }
                }
            }
        }
        // 出力
        System.out.println(ans);

    }
}
