import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] aArr = new Integer[n];

        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }

        Arrays.sort(aArr, Collections.reverseOrder());

        int scoreA = 0;
        int scoreB = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                scoreA += aArr[i];
            } else {
                scoreB += aArr[i];
            }
        }

        System.out.println(scoreA - scoreB);
    }
}
