import java.util.*;

public class Main {
    public static void main(String[] args) {
        solve(new Scanner(System.in));
//        solve(new Scanner(ex));
    }

    private static final String ex = "WWWWW";
//    private static final String ex = "WWWWWBWBWBBBBWBWWWWBBBB";
//    private static final String ex = "WBWBWBWBWB";

    private static void solve(Scanner scanner) {
        String s = scanner.nextLine();

        LinkedList<Character> stones = new LinkedList<>();
        char last = s.charAt(0);
        stones.add(last);
        for (int i = 1; i < s.length(); i ++) {
            if (last != s.charAt(i)) {
                last = s.charAt(i);
                stones.add(last);
            }
        }

        if (stones.stream().allMatch(x -> x == 'W')) {
            System.out.println(0);
            return;
        } else if (stones.stream().allMatch(x -> x == 'B')) {
            System.out.println(0);
            return;
        }

        System.out.println(stones.size() - 1);
    }
}
