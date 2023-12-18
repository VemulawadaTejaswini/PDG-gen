import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int condition = scanner.nextInt();

        boolean shouldBreak = false;
        int[] result = new int[length];
        Arrays.fill(result, -1);
        for (int i = 0; i < condition; i++) {
            int at = length - scanner.nextInt(); // 左から数えた0Indexの値
            int num = scanner.nextInt();
            // 投げられる値は整数かつ0から9だけなので、指定された値が重複しないtことと、一番大きい桁が0で始まらないことをチェックすればOKでしょう多分
            int wk = result[at];
            if (wk != -1 && wk != num) { // 打ち切り
                shouldBreak = true;
//                System.out.println(-1);
//                return;
            }
            result[at] = num;
        }
        if (shouldBreak) {
            System.out.println(-1);
            return;
        }

        if (result[length - 1] == -1) { // 桁数の最大値が指定されていない === NG?
            System.out.println(-1);
            return;
        }
        if (result[length - 1] == 0) {
            if (result.length != 1) {
                System.out.println(-1);
            } else {
                System.out.println(0);
            }
            return;
        }
        for (int i = 0; i < length; i++) { // fill
            if (result[i] == -1) {
                result[i] = 0;
            }
        }
        List<String> list = Arrays.stream(result).mapToObj(e -> e + "").collect(Collectors.toList());
        Collections.reverse(list);
        System.out.println(String.join("", list));
    }
}