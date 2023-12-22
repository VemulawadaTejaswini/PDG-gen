import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int takahashi_hp = sc.nextInt();
        // スペース区切りの整数の入力
        int takahashi_att = sc.nextInt();
        int aoki_hp = sc.nextInt();
        int aoki_att = sc.nextInt();
        while (true) {
            aoki_hp = -takahashi_att;
            if (aoki_hp <= 0) {
                System.out.println("Yes");
                break;
            }
            takahashi_hp = -aoki_att;
            if (takahashi_hp <= 0) {
                System.out.println("No");
                break;
            }
        }
    }
}
