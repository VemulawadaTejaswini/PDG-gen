import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int ans;

        if ((1 <= a && a <= 9) && (1 <= b && b <= 9)) {
            ans = a * b;
        }else {
            ans = -1;
        }
        // 出力
        System.out.println(Integer.toString(ans));

    }
}
