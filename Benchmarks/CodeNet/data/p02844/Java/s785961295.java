import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();

        // 主処理
        char[] array = s.toCharArray();
        int[] count = new int[10000];
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int k = j + 1;
                StringBuilder sb = new StringBuilder(s);
                int[] countArray = calcCountArray(sb.substring(k).toString());
                for (int l = 0; l < 10; l++) {
                    if (countArray[l] == 1) {
                        int num = ((int) array[i] - 48) * 100 + ((int) array[j] - 48) * 10 + l;
                        count[num] = 1;
                    }
                }
            }
        }
        int sum = Arrays.stream(count).sum();
        int result = sum;

        // 出力
        System.out.println(result);
    }

    public static int[] calcCountArray(String s) {
        int[] count = new int[10];
        if (s.contains("0")) {
            count[0]++;
        }
        if (s.contains("1")) {
            count[1]++;
        }
        if (s.contains("2")) {
            count[2]++;
        }
        if (s.contains("3")) {
            count[3]++;
        }
        if (s.contains("4")) {
            count[4]++;
        }
        if (s.contains("5")) {
            count[5]++;
        }
        if (s.contains("6")) {
            count[6]++;
        }
        if (s.contains("7")) {
            count[7]++;
        }
        if (s.contains("8")) {
            count[8]++;
        }
        if (s.contains("9")) {
            count[9]++;
        }
        return count;
    }
}
