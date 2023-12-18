import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 入力
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int max = 0;

        if (a <= k) {
            max += a;
            k -= a;
        } else {
            max += k;
            k = 0;
        }

        if (b <= k) {
            k -= b;
        } else {
            k = 0;
        }

        if (c <= k) {
            max -= c;
            k -= c;
        } else {
            max -= k;
            k = 0;
        }
        
        // 出力
        System.out.println(max);
    }
}
