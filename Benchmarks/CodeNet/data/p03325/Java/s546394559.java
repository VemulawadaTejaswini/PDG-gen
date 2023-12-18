import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(sc.next()));
        }

        // 主処理
        int result = 0;
        boolean doContinue = true;
        while (doContinue) {
            int targetTri = a.stream().mapToInt(t -> t).filter(t -> t % 2 != 0).min().orElse(-1);
            int targetHalf = a.stream().mapToInt(t -> t).filter(t -> t % 2 == 0).max().orElse(-1);
            if (targetTri < 0 || targetHalf < 0) {
                break;
            }
            int indexTri = a.indexOf(targetTri);
            int IndexHalf = a.indexOf(targetHalf);
            a.set(indexTri, targetTri * 3);
            a.set(IndexHalf, targetHalf / 2);
            result++;
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}