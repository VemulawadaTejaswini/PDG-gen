import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by nakatsukatakahiro on 2017/06/11.
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int sum = 0;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int tmp = scanner.nextInt();
            sum += tmp;
            if (tmp % 10 == 0) {
                b.add(tmp);
            } else {
                a.add(tmp);
            }
        }
        a.sort(Comparator.naturalOrder());
        b.sort(Comparator.naturalOrder());

        int i = 0;
        while (sum % 10 == 0 && sum != 0) {
            sum -= a.get(i);
            i++;
        }
        int j = 0;
        while (sum % 10 == 0 && sum != 0) {
            sum -= b.get(j);
            j++;
        }

        System.out.println(sum);
    }
}
