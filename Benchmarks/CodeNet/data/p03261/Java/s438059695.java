import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        List<String> w = Stream.generate(() -> null).limit(n).map(i -> scanner.next()).collect(Collectors.toList());
        a: if (new HashSet<>(w).size() == n) {
            Character last = null;
            for (String s : w) {
                if (last != null && !last.equals(s.charAt(0)))
                    break a;
                last = s.charAt(s.length() - 1);
            }
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}