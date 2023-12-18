import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String s = sc.nextLine();
        final int k = sc.nextInt();

        final HashSet<String> xs = new HashSet<>();

        int slen = s.length();
        for (int len = 1; len <= slen; len++) {
            for (int i = 0; i + len <= slen; i++) {
                String sub = s.substring(i, i + len);
                xs.add(sub);
            }
        }

        List<String> sorted = xs.stream().sorted().limit(k).collect(Collectors.toList());
        System.out.println(sorted.get(k - 1));
    }
}
