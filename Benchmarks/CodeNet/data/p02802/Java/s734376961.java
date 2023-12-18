import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.next());
        int M = Integer.parseInt(s.next());
        boolean[] completed = new boolean[N];
        int ac = 0;
        int wa = 0;
        for (int i = 0; i < M; i++) {
            int p = Integer.parseInt(s.next()) - 1;
            if (completed[p]) {
                s.next();
                continue;
            }
            String S = s.next();
            if (Objects.equals(S, "WA")) {
                wa++;
            } else {
                ac++;
                completed[p] = true;
            }
        }
        System.out.println(ac + " " + wa);
    }

}
