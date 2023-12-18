import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = Integer.parseInt(stdin.nextLine());
        int[] a = Pattern.compile(" ").splitAsStream(stdin.nextLine()).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(a);

        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        int lo = a[0];
        int hi = a[n - 1];
        for (int i = 1; i < n - 1; i++) {
            if (a[i] > 0) {
                x.add(lo);
                y.add(a[i]);
                lo = lo - a[i];
            } else {
                x.add(hi);
                y.add(a[i]);
                hi = hi - a[i];
            }
        }
        x.add(hi);
        y.add(lo);

        System.out.println(hi - lo);
        for (int i = 0; i < x.size(); i++) {
            System.out.printf("%d %d%n", x.get(i), y.get(i));
        }
    }

}
