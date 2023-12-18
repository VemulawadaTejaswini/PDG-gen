import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        String s = sc.next();

        Set<String> sets = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int k = i + 1; k < s.length(); k++) {
                for (int j = k + 1; j < s.length(); j++) {
                    String target = "" + s.charAt(i) + s.charAt(k) + s.charAt(j);
                    if (!sets.contains(target))
                        sets.add(target);
                }

            }
        }

        System.out.println(sets.size());
    }
}