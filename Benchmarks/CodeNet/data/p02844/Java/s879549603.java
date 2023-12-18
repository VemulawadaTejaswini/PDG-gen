import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        String s = sc.next();

        long kesu = n - 3;

        Set<String> sets = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {

            for (int k = i + 1; k < s.length(); k++) {
                for (int j = k + 1; j < s.length(); j++) {
                    sets.add("" + s.charAt(i) + s.charAt(k) + s.charAt(j));
                }

            }
        }

        System.out.println(sets.size());
    }
}