import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()); // 敵の数
        int k = Integer.parseInt(sc.next()); // 必殺技の使用回数
        ArrayList<Integer> hp = new ArrayList<>(n); // 各敵の体力
        for (int i = 0; i < n; i++) {
            hp.add(Integer.parseInt(sc.next()));
        }
        // 敵を体力の降順にソートして、先頭から必殺技の回数分敵を除去
        Collections.sort(hp, Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            if (hp.isEmpty()) {
                break;
            }
            hp.remove(0);
        }
        // 残った敵体力の合計値が攻撃回数
        long ans = 0;
        for (Integer i : hp) {
            ans += i;
        }
        System.out.println(ans);
        sc.close();
    }
}
