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
        String[] array = sc.next().split(HALF_SPACE);
        
        // 演算
        List<String> returnList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // 操作1
            returnList.add(array[i]);
            // 操作2
            Collections.reverse(returnList);
        }
        
        // 出力
        System.out.println(String.join(HALF_SPACE, returnList.toArray(new String[]{})));
    }

}