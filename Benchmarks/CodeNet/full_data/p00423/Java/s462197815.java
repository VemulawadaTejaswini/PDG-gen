import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CardSum {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        while(true) {
            // 配られるカードの枚数取得
            int loopCnt = Integer.parseInt(sc.nextLine());
            if(loopCnt==0)break;
            // プレイヤーAの得点
            int sumA=0;
            // プレイヤーBの得点
            int sumB=0;

            // 枚数分ループ
            for(int cnt=1;cnt<=loopCnt;cnt++) {
                // カード取得
                List<String> listString = Arrays.asList(sc.nextLine().split(" "));
                List<Integer> list = new ArrayList<>();
                for (String num : listString) {
                    list.add(Integer.parseInt(num));
                }

                // カード比較
                if (list.get(0) == list.get(1)) {
                    // 同値の場合
                    sumA += list.get(0);
                    sumB += list.get(1);
                } else if (list.get(0) > list.get(1)) {
                    // Aが大きい場合
                    sumA += list.get(0) + list.get(1);
                } else {
                    // Bが大きい場合
                    sumB += list.get(0) + list.get(1);
                }
            }
            System.out.println(sumA+" "+sumB);
        }
    }

}

