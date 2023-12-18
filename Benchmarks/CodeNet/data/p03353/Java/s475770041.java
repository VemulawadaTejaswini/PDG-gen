import java.util.*;

public class Main {

    static String s;
    static int K;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        K = sc.nextInt();

        System.out.println( solve() );

    }

    static String solve() {
        List<String> substrings = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = i+1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (!substrings.contains(sub)) {
                    substrings.add(sub);
                }
                count++;
                if (count == K) {
                    break;
                }
            }
        }

        Collections.sort(substrings);
        return substrings.get(K - 1);
    }
}