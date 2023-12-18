import java.io.*;
import java.util.*;

public class Main {
    public static void main(String... args) {
        List<Apple> apples = new ArrayList();
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        String[] input = null;
        // 標準入力読み込み
        try {
            input = br.readLine().split(" ");
            br.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        // applesリストの作成
        for (String in : input) {
            apples.add(new Apple(in));
        }
        // tasteの絶対値を基準に、applesを昇順でソート
        apples.sort((a1, a2) -> {
            int a1AbsTaste = a1.taste >= 0 ? a1.taste : -1 * a1.taste;
            int a2AbsTaste = a2.taste >= 0 ? a2.taste : -1 * a2.taste;
            return Integer.compare(a1AbsTaste, a2AbsTaste);
        });

        // 合計値の計算
        Integer totalTaste = 0;
        apples.remove(0);
        for (Apple a : apples) {
            totalTaste += a.taste;
        }
        System.out.println(totalTaste);
    }
}

class Apple {
    int taste;
    Apple(String taste){
        this.taste = Integer.parseInt(taste);
    }
    @Override
    public String toString() {
        return ((Integer)this.taste).toString();
    }
}