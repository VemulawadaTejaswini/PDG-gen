import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        Integer[] arrX = new Integer[n];
        Integer[] arrY = new Integer[m];
        Arrays.setAll(arrX, i -> Integer.parseInt(sc.next()));
        Arrays.setAll(arrY, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        int max = Arrays.stream(arrX).mapToInt(i -> i).max().getAsInt();
        int maxX = Math.max(max, x);

        int min = Arrays.stream(arrY).mapToInt(i -> i).min().getAsInt();
        int minY = Math.min(min, y);

        boolean judge = maxX < minY;
        String result = judge ? "No War" : "War";

        // 出力
        System.out.println(result);
    }
}
