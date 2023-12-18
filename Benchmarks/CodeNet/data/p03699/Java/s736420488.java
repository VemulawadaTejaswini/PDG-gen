import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        Integer[] s = new Integer[N];
        int sum = 0;
        for (int i=0;i<N;i++) {
            s[i] = Integer.parseInt(scanner.next());
            sum += s[i];
        }
        scanner.close();

        if (sum % 10 != 0) {
            System.out.println(sum);
            return;
        }

        Arrays.sort(s);

        for (int num : s) {
            int tmp = sum - num;

            if (tmp % 10 != 0) {
                System.out.println(tmp);
                return;
            }
        }

        System.out.println(0);
    }
}
