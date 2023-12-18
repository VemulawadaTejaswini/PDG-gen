import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();

        // 主処理
        String[] array = s.split("");
        int result = 0;
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (j - i != k - j) {
                        Set<String> set = new HashSet<>();
                        set.add(array[i]);
                        set.add(array[j]);
                        set.add(array[k]);
                        if (set.size() == 3) {
                            result++;
                        }
                    }
                }
            }
        }

        // 出力
        System.out.println(result);
    }
}
