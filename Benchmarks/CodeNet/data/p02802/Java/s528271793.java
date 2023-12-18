import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()); // 問題数
        int m = Integer.parseInt(sc.next()); // 提出回数
        HashSet<Integer> achs = new HashSet<>(n); // 正答済みの問題番号を保管
        // 正答数：'AC'を1回以上出した問題の数
        int ac_count = 0;
        // ペナルティ数：正答済みの各問題において、初めて'AC'を出すまでに出した'WA'の数の総和
        int wa_count = 0;
        for (int i = 0; i < m; i++) {
            int p = Integer.parseInt(sc.next()); // 提出した問題番号
            String s = sc.next(); // 結果
            // 正答済みの問題番号はスキップ
            if (achs.contains(p)) {
                continue;
            }
            // 結果がACの場合
            if (s.equals("AC")) {
                ac_count++; // 正答数を加算
                achs.add(p); // 問題番号をHashSetに格納
                continue;
            }
            // 上記以外はWAとしてペナルティ数に加算
            wa_count++;
        }
        // 一度も正答しなかった問題番号はペナルティにならないため、ペナルティ数から減算
        wa_count -= m - achs.size();

        System.out.println(String.format("%s %s", ac_count, wa_count));
        sc.close();
    }
}
