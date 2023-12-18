import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.next());
        int M = Integer.parseInt(s.next());
        List<Integer> completed = new ArrayList<>();
        int ac = 0;
        int wa = 0;
        for (int i = 0; i < M; i++) {
            int p = Integer.parseInt(s.next());
            if (completed.contains(p)) {
                s.next();
                continue;
            }
            String S = s.next();
            if (Objects.equals(S, "WA")) {
                wa++;
            } else {
                ac++;
                completed.add(p);
            }
        }
        System.out.println(ac + " " + wa);
    }

}
