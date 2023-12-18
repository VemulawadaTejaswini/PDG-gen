import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] coordinatesLine = new int[n];
        for (int i = 0; i < n; i++) {
            coordinatesLine[i] = scanner.nextInt();
        }
        Arrays.sort(coordinatesLine);
        int answer = Integer.MAX_VALUE;
        for (int i = 1; i < 100; i++) {
            int temp = 0;
            for (int k = 0; k < n; k++) {
                int square = coordinatesLine[k] - i;
                temp += square * square;
            }
            if (temp < answer) {
                answer = temp;
            }
        }
        System.out.println(answer);
    }
}
