import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String N = scanner.nextLine();
        String a_list = scanner.nextLine();
        List<Integer> a = Arrays.asList(a_list.split(" ")).stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());

        scanner.close();

        int max_m = 1;
        for (int ai : a) {
            max_m = max_m * ai;
        }

        int max = 0;
        for (int i = 0; i < max_m; ++i) {
            int res = 0;
            // System.out.println("---");
            // System.out.println(i);
            for (int j = 0; j < a.size(); ++j) {
                res += i % a.get(j);
                // System.out.println(a.get(j) + " : "  + (i % a.get(j)));
                // System.out.println(res);
            }

            if (res > max) {
                max = res;
            }
        }

        System.out.print(max);
    }
}