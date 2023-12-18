import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        int count = 0;
        char[] array = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {
            if (array[i] == 'B' && array[i + 1] == 'W') {
                array[i] = 'W';
                array[i + 1] = 'B';
                count++;
                i = Math.max(-1, i - 2);
            }
        }
        int result = count;

        // 出力
        System.out.println(result);
    }
}
