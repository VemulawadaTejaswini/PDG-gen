import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        int result = 0;
        int index = (s.length() - 2) / 2;
        while (1 <= index) {
            boolean isEvenString = true;
            for (int i = 0; i < index; i++) {
                if (s.charAt(i) != s.charAt(index + i)) {
                    isEvenString = false;
                }
            }
            if (isEvenString) {
                result = index * 2;
                break;
            }
            index--;
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
