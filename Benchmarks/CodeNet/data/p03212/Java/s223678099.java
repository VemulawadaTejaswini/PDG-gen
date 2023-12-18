import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long ans = 0;

        int max = String.valueOf(n).length();

        StringBuilder sevenBuilder = new StringBuilder();
        // 7の数
        for (int i = 1; i <= max - 2; i++) {
            sevenBuilder.append("7");
            StringBuilder fiveBuilder = new StringBuilder();
             // 5の数
            for (int j = 1; i + j <= max - 1; j++) {
                fiveBuilder.append("5");
                StringBuilder threeBuilder = new StringBuilder();
                // 3の数
                for (int k = 1; i + j + k <= max; k++) {
                    threeBuilder.append("3");
                    permutation(String.valueOf(threeBuilder) + fiveBuilder + sevenBuilder, "");
                    Double[] v = list.toArray(new Double[0]);
                    int index = -(Arrays.binarySearch(v, n + 0.1)) - 1;
                    ans += index;
                    list.clear();
                    if (index != v.length) {
                        break;
                    }
                }
            }
        }

        System.out.println(ans);
    }

    private static TreeSet<Double> list = new TreeSet<>();

    private static void permutation(String q, String ans) {
        // Base Case
        if (q.length() <= 1) {
            list.add(Double.parseDouble(ans + q));
        }
        // General Case
        else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1),
                        ans + q.charAt(i));
            }
        }
    }
}