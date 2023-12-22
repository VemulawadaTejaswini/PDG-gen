
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Set<String> S = new HashSet<>();

        String s = null;
        for (int i = 0; i < N; i++) {
            s = sc.next();
            S.add(s);
        }
        System.out.println(S.size());

    }

}
