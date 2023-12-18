import java.util.Scanner;

/**
 * Created by hkoba on 2018/01/08.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // スペース区切りの整数の入力
        int k = sc.nextInt();
        int total = 0;
        int max = 0;
        for (int i = 0; i < k; i++) {
            int v = sc.nextInt();
            total += v;
            if (v > max) {
                max = v;
            }
        }
        if (k == 1) {
            max = 0;
        }
        System.out.println(total - max);
    }
}
