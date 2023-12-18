import java.util.*;

public class Main {

    private static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(sc.nextInt());
        }
        String p = builder.toString();
        builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(sc.nextInt());
        }
        String q = builder.toString();
        builder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            builder.append(i);
        }

        permutation(builder.toString(), "");

        System.out.println(Math.abs(list.indexOf(p) - list.indexOf(q)));
    }

    private static void permutation(String q, String ans) {
        // Base Case
        if (q.length() <= 1) {
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
