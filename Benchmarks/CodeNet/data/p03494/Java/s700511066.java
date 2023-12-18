import java.util.Scanner;

/**
 * @author varun on 7/1/2018
 * @project CompetitiveProgramming
 */
public class Main {
    private boolean check(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Main o = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine().trim());
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        int ans = 0;
        while(o.check(numbers)) {
            ans++;
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] /= 2;
            }
        }
        System.out.println(ans);
    }
}
