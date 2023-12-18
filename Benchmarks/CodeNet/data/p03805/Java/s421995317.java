import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean[][] meiro = new boolean[n][n];

        for (int i = 0; i < m; i++) {
            int left = sc.nextInt() - 1;
            int right = sc.nextInt() - 1;
            meiro[left][right] = true;
            meiro[right][left] = true;
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 1; i < n; i++) {
            builder.append(i);
        }

        String base = builder.toString();
        permutation(base, "");

        int count = 0;

        top : for (String target: list
             ) {
            String[] values = target.split("");
            int lastValue = 0;
            for (String value : values) {
                int start = lastValue;
                int end = Integer.parseInt(value);
                if (!meiro[start][end]) {
                    continue top;
                }
                lastValue = end;
            }
            count++;
        }

        System.out.println(count);
    }

    private static ArrayList<String> list = new ArrayList<>();

    private static void permutation(String q, String ans){
        // Base Case
        if(q.length() <= 1) {
            list.add(ans + q);
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