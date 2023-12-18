import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String, Integer> S = new HashMap<String, Integer>();

        for (int i = 0; i < N; i++) {
            String target = sc.next();
            if (S.get(target) == null) {
                S.put(target, 0);
            }
        }
        System.out.println(S.size());
    }
}