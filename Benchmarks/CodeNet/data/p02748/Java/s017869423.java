import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static PrintWriter out;

    public static void main(String[] args) {
        Main.run();
    }

    private static void run() {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        Scanner sc = new Scanner(System.in);
        // input
        int a = Integer.parseInt(sc.next()); // 冷蔵庫種類
        int b = Integer.parseInt(sc.next()); // クーラー種類
        int m = Integer.parseInt(sc.next()); // 割引券枚数
        // 冷蔵庫価格リスト
        ArrayList<Integer> alist = new ArrayList<>(a);
        for (int i = 0; i < a; i++) {
            alist.add(Integer.parseInt(sc.next()));
        }
        // クーラー価格リスト
        ArrayList<Integer> blist = new ArrayList<>(b);
        for (int i = 0; i < b; i++) {
            blist.add(Integer.parseInt(sc.next()));
        }
        // 割引券HashMap(key:割引対象番号,value:割引額)
        HashMap<String, Integer> discount = new HashMap<>(m);
        for (int i = 0; i < m; i++) {
            String x = sc.next(); // 割引対象の番号：冷蔵庫
            String y = sc.next(); // 割引対象の番号：クーラー
            int value = Integer.parseInt(sc.next()); // 割引額
            String key = x + y; // 2種類の割引対象番号を文字列結合
            // 同一の割引対象番号が複数存在する場合、割引額が大きい方を残す
            if (discount.containsKey(key)) {
                discount.put(key, Math.max(discount.get(key), value));
            } else {
                discount.put(key, value);
            }
        }

        // 合計額HashMap(key:商品番号,value:合計額)
        HashMap<String, Integer> totalprice = new HashMap<>();
        for (int i = 0; i < a; i++) {
            int aprice = alist.get(i);
            for (int j = 0; j < b; j++) {
                int bprice = blist.get(i);
                String key = String.valueOf(i + 1) + String.valueOf(j + 1);
                int value = aprice + bprice;
                if (discount.containsKey(key)) {
                    value -= discount.get(key);
                }
                totalprice.put(key, value);
            }
        }

        int answer = 999999999;
        for (String s : totalprice.keySet()) {
            answer = Math.min(answer, totalprice.get(s));
        }

        out.println(answer);
        out.close();
        sc.close();
    }

}
