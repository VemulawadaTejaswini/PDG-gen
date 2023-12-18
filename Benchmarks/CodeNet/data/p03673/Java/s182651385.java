import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String HALF_SPACE = " ";

    public static void main(String... args) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        // 演算
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // 操作1
            list.add(String.valueOf(a[i]));
            // 操作2
            Collections.reverse(list);
        }
        
        // 出力
        System.out.println(String.join(HALF_SPACE, list.toArray(new String[]{})));
    }

}