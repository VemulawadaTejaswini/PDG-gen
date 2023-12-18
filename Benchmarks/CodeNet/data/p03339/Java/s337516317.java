import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    static int N;
    static String S;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.next();

        solve();
    }

    static void solve() {

        List<String> list = S.chars().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.toList());

        int min = S.length() + 1;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (j < i) {
                    if (list.get(j).equals("W")) {
                        count++;
                    }
                } else if (i < j) {
                    if (list.get(j).equals("E")) {
                        count++;
                    }
                }
            }
            min = Math.min(min, count);
        }
        System.out.println(min);
    }
}
