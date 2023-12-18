import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            d.add(sc.nextInt());
        }

        // nを配列にする
        String[] strN = Integer.toString(n).split("");
        int[] arrN = new int[strN.length];
        for (int i = 0; i < strN.length; i++)  {
            arrN[i] = Integer.parseInt(strN[i]);
        }

        // 使用可能な数字
        List<Integer> useNumber = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (!d.contains(i)) {
                useNumber.add(i);
            }
        }

        String[] result = new String[arrN.length];
        for (int i = 0; i < result.length; i++) {
            int min = 9;
            for (int j = 0; j < useNumber.size(); j ++) {
                if (arrN[i] <= useNumber.get(j) && min >= useNumber.get(j)) {
                    min = useNumber.get(j);
                }
            }
            result[i] = Integer.toString(min);
        }

        System.out.println(String.join("", result));
    }
}
