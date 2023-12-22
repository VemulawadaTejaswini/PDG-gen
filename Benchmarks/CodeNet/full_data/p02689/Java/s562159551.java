import java.util.*;

public class Main {
    public static void main(String... args){

        Scanner scanner = new Scanner(System.in);

        // 展望台の数, 道の数
        int num_tenbou = scanner.nextInt();
        int num_michi = scanner.nextInt();

        //　展望台の高さの配列
        ArrayList<Double> arr_high = new ArrayList<Double>();
        // 自分が「良い展望台 = True」とする
        //      それを記録するリスト
        ArrayList<Boolean> arr_isGood = new ArrayList<Boolean>(num_tenbou);
        for(int i = 0; i < num_tenbou; i++){
            arr_isGood.add(true);
        }

        // 高さの入力
        for(int i = 0; i < num_tenbou; i++){
            double high = scanner.nextDouble();
            arr_high.add(high);
        }
        // 道の入力
        for(int i = 0; i < num_michi; i++){
            // 展望台Aと展望台Bが繋がっている
            int tenbou_a = scanner.nextInt();
            int tenbou_b = scanner.nextInt();

            // AとBの高さを比べて低い方を悪い展望にする;
            if (arr_high.get(tenbou_a - 1) > arr_high.get(tenbou_b - 1)){
                arr_isGood.set(tenbou_b - 1, false);
            } else if (arr_high.get(tenbou_a - 1) < arr_high.get(tenbou_b - 1)) {
                arr_isGood.set(tenbou_a - 1, false);
            } else {
                arr_isGood.set(tenbou_b - 1, false);
                arr_isGood.set(tenbou_a - 1, false);
            }

        }

        // 残っている良い展望台を数え上げて出力
        int ans = 0;
        for (int i = 0; i < num_tenbou ; i++){
            if(arr_isGood.get(i)){
                ans++;
            }
        }

        System.out.println(ans);

    }
}
