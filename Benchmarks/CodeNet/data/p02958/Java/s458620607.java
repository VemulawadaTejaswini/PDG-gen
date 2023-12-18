import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] array = Arrays.asList(sc.next()).stream().mapToInt(Integer::parseInt).toArray();
        if (answer2(a, array)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean answer2(int a, int[] list) {

        int faultCount = 0;
        int faultIndex = -1;
        int targetIndex = list.length;
        boolean needSwap = false;
        for (int i = 0; i < list.length - 1; i++) {

            if (list[i] == a) {
                targetIndex = i;
            }

            boolean isTarget = (list[i] == a || list[i + 1] == a);
            if (isTarget) {
                if (list[i] > list[i + 1]) {
                    needSwap = true;
                }
                continue;
            }

            if (list[i] > list[i + 1]) {
                faultCount++;
                faultIndex = i + 1;
            }
        }

        if (!needSwap && faultCount == 0) {
            return true;
        }
        if (faultCount > 1) {
            return false;
        }
        if (needSwap && faultIndex == -1) {
            return false;
        }

        int faultValue = list[faultIndex];
        list[faultIndex] = a;
        list[targetIndex] = faultValue;

        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }

        return true;

    }

}
