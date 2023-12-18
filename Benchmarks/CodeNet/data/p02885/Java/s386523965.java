import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans;

        if (b >= a || b * 2 >= a) {
            ans = 0;
        }else {
            ans = a - (b * 2);
        }
        // 出力
        System.out.println(Integer.toString(ans));

    }
}
