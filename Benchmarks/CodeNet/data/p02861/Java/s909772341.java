import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.IntStream;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int[][] pos = new int[n][2];

        for (int cnt = 0; cnt < n; cnt++) {
            pos[cnt][0] = scanner.nextInt();
            pos[cnt][1] = scanner.nextInt();
        }

        String st = IntStream.range(0, n).mapToObj(it -> "" + it)
                .collect(Collector.of(StringBuilder::new, StringBuilder::append, StringBuilder::append, StringBuilder::toString));
        ArrayList<String> list = new ArrayList<>();
        permutation(st, "", list);

        BigDecimal bigDecimal = IntStream.range(0, factorial(n))
//        OptionalDouble average = IntStream.range(0, n)
                .mapToObj(list::get)
                .map(it -> {
//                    System.out.println(it);
                    char[] chars = it.toCharArray();
//                    double result = 0;
                    BigDecimal result = BigDecimal.ZERO;
                    for (int idx = 1; idx < chars.length; idx++) {
                        int pos1 = Integer.parseInt(chars[idx - 1] + "");
                        int pos2 = Integer.parseInt(chars[idx] + "");
//                        System.out.println(pos1 + "," + pos2);
                        result = result.add(new BigDecimal(distance(pos[pos1][0], pos[pos1][1], pos[pos2][0], pos[pos2][1])), MathContext.DECIMAL128);
//                        result += ;
                    }

                    return result;
                })
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .divide(new BigDecimal(factorial(n) + ""), MathContext.DECIMAL128);
//                .divide(new BigDecimal(""))
//                .get();

        System.out.println(bigDecimal.toString());
    }

    static String distance(int x1, int y1, int x2, int y2) {
        return "" + Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    static int factorial(int n) {
        int fact = 1;
        if (n == 0) return fact;
        else {
            for (int i = n; i > 0; i--) fact *= i;
            return fact;
        }
    }

    // http://chakotay.jugem.jp/?eid=612
    public static void permutation(String q, String ans, ArrayList<String> result) {
        // Base Case
        if (q.length() <= 1) {
//            System.out.println(ans + q);
            result.add(ans + q);
        }
        // General Case
        else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1), ans + q.charAt(i), result);
            }
        }
    }
}
