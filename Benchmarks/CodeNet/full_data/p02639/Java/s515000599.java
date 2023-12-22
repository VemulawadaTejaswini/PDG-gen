import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(sc.next()));
        list.add(Integer.parseInt(sc.next()));
        list.add(Integer.parseInt(sc.next()));
        list.add(Integer.parseInt(sc.next()));
        list.add(Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        int result = list.indexOf(0) + 1;

        // 出力
        System.out.println(result);
    }
}
