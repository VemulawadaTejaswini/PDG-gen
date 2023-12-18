import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int d = i;
            int x = 0;
            while (d > 0) {
                x += d % 10;
                d /= 10;
            }

            if (x >= a && x <= b) {
                sum += i;
            }
        }
        // 出力
        System.out.println(sum);
    }
}
