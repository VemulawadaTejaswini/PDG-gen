import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String s = scanner.next();

        scanner.close();

        System.out.println(resolve(n, s));

        // System.out.println(System.currentTimeMillis() - startTime);
    }

    private static int resolve(int n, String s) {

        int max = 0;
        String x, y;
        for (int i = 1; i < n; i++) {
            x = s.substring(0, i);
            y = s.substring(i, n);
            int count = compare(x, y);
            if (max < count) {
                max = count;
            }
        }
        return max;
    }

    private static int compare(String x, String y) {
        List<String> listX = Arrays.asList(x.split("")).stream().distinct().collect(Collectors.toList());
        List<String> listY = Arrays.asList(y.split("")).stream().distinct().collect(Collectors.toList());
        return (int) listX.stream().filter(listY::contains).count();
    }
}
