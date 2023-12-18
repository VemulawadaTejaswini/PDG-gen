import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String inputStr = sc.next();
        char[] S = inputStr.toCharArray();
        List<Integer> counts = getCounts(S);
        //Integer[] countArray = (Integer[]) counts.toArray();
        int[] countArray = new int[2*N];
        Arrays.fill(countArray, 0);
        int n = 0;
        for (Integer count : counts) {
            countArray[n] = count;
            n++;
        }

        int max0 = 0;
        int max1 = 0;
        if (S[0] == '0') { // 先頭が0から開始する場合
            for (int i = 0; i < countArray.length; i+=2) {
                int sum = 0;
                if (i == 0) {
                    for (int j = i; j <= (i + 2*K - 1); j++) {
                        if (countArray[j] == 0) break;
                        sum += countArray[j];
                    }
                }
                else {
                    for (int j = i - 1; j <= (i + 2*K - 1); j++) {
                        if (countArray[j] == 0) break;
                        sum += countArray[j];
                    }
                }
                max0 = Math.max(max0, sum);
            }
        }
        else { // 先頭が1から開始する場合
            for (int i = 1; i < countArray.length; i+=2) {
                int sum = 0;
                for (int j = i - 1; j <= (i + 2*K - 1); j++) {
                    if (countArray[j] == 0) break;
                    sum += countArray[j];
                }

                max1 = Math.max(max1, sum);
            }
        }
        int ans = Math.max(max0, max1);
        System.out.println(ans);
    }

    static List<Integer> getCounts(final char[] S) {
        List<Integer> counts = new ArrayList<Integer>();
        int count = 0;
        int length = S.length;
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                count++;
                if (length == 1) {
                    counts.add(count);
                    break;
                }
            }
            else {
                if (S[i - 1] == S[i]) {
                    count++;
                } else {
                    counts.add(count);
                    count = 1;
                }
                if (i == (length - 1)) {
                    counts.add(count);
                }
            }
        }
        return counts;
    }
}
