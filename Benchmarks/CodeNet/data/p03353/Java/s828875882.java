import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int k = in.nextInt();

        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= Math.min(i + 5, s.length()); j++) {
                set.add(s.substring(i, j));
            }
        }

        for (int i = 0; i < k - 1; i++) {
            set.pollFirst();
        }

        System.out.println(set.pollFirst());
    }
}