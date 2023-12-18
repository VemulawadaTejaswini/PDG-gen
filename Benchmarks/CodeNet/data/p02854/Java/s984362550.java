import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] as = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int length = Arrays.stream(as).sum();

        int aboutHalfPosition = 0;
        int halfLength = length / 2;
        int tmpLengthSum = 0;
        for (int i = 0; i < n; i++) {
            tmpLengthSum += as[i];
            if (tmpLengthSum == halfLength) {
                System.out.println(0);
                return;
            }
            if (tmpLengthSum > halfLength) {
                aboutHalfPosition = i;
                break;
            };
        }

        int money = 0;

        System.out.println(money);
    }
}
