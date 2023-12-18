import java.util.Arrays;
import java.util.Scanner;

/**
 * @author varun on 7/1/2018
 * @project CompetitiveProgramming
 */
public class Main {
    static int[] numbers = new int[100001];
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            int nCopies = scanner.nextInt();
            numbers[number] += nCopies;
        }
        Arrays.sort(numbers);
        int counter = 0;
        int ans = 0;
        for (int i = 0; i < 100001; i++) {
            if (numbers[i] != 0) {
                counter+=numbers[i];
                ans++;
                if (counter >= k) {
                    System.out.println(ans);
                    break;
                }
            }
        }
    }
}
