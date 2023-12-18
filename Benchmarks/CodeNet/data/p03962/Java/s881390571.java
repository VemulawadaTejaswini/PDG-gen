import java.util.*;

public class Main {
    public static void main(String[] args) {
        solve(new Scanner(System.in));
//        solve(new Scanner(ex));
    }

    private static final String ex = "3 3 33";

    private static void solve(Scanner scanner) {
        String[] split = scanner.nextLine().split(" ");
        Set<String> set = new HashSet<>();
        set.add(split[0]);
        set.add(split[1]);
        set.add(split[2]);
        System.out.println(set.size());
    }
}

