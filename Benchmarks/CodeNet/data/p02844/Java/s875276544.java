import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        Set<String> strs = new TreeSet<>();

        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (i == j) break;
                for (int k = j + 1; k < n; ++k) {
                    if (j == k) break;
                    String tmp = s.substring(i, i + 1) + s.substring(j, j + 1) + s.substring(k, k + 1);
                    strs.add(tmp);
                }
            }
        }

        System.out.println(strs.size());
    }
}