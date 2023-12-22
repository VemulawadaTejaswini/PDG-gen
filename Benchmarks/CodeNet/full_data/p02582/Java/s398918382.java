import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        char[] S = scanner.next().toCharArray();

        // 真面目に書く
        int maxCount = 0;
        for (int i = 0, currentCnt = 0; i < S.length; i++) {
            if (S[i] == 'R') {
                currentCnt++;

                if (maxCount < currentCnt) {
                    maxCount = currentCnt;
                }
            } else {
                if (maxCount < currentCnt) {
                    maxCount = currentCnt;
                }
                currentCnt = 0;
            }
        }

        System.out.println(maxCount);
    }
}
