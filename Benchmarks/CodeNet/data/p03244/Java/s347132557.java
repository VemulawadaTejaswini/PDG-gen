import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        int[] oddIndexNumberCount = new int[100001];
        for (int i = 0; i < n; i += 2) {
            oddIndexNumberCount[a[i]]++;
        }
        int oddIndexNumberCountFirst = 0;
        int oddIndexNumberCountSecond = 0;
        for (int i = 0; i < oddIndexNumberCount.length; i++) {
            if (oddIndexNumberCountFirst <= oddIndexNumberCount[i]) {
                oddIndexNumberCountSecond = oddIndexNumberCountFirst;
                oddIndexNumberCountFirst = oddIndexNumberCount[i];
            }
        }
        int oddIndexNumber = 0;
        for (int i = 0; i < oddIndexNumberCount.length; i++) {
            if (oddIndexNumberCount[i] == oddIndexNumberCountFirst) {
                oddIndexNumber = i;
            }
        }

        int[] evenIndexNumberCount = new int[100001];
        for (int i = 1; i < n; i += 2) {
            evenIndexNumberCount[a[i]]++;
        }
        int evenIndexNumberCountFirst = 0;
        int evenIndexNumberCountSecond = 0;
        for (int i = 0; i < evenIndexNumberCount.length; i++) {
            if (evenIndexNumberCountFirst <= evenIndexNumberCount[i]) {
                evenIndexNumberCountSecond = evenIndexNumberCountFirst;
                evenIndexNumberCountFirst = evenIndexNumberCount[i];
            }
        }
        int evenIndexNumber = 0;
        for (int i = evenIndexNumberCount.length - 1; 0 <= i; i--) {
            if (evenIndexNumberCount[i] == evenIndexNumberCountFirst) {
                evenIndexNumber = i;
            }
        }

        int result = 0;
        if (oddIndexNumber == evenIndexNumber) {
            result += n - oddIndexNumberCountFirst - Math.max(oddIndexNumberCountSecond, evenIndexNumberCountSecond);

        } else {
            result += n - oddIndexNumberCountFirst - evenIndexNumberCountFirst;
        }

        // 出力
        System.out.println(result);
    }
}
