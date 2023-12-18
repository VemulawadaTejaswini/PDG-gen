import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; ++i) arr[i] = sc.next();
        sc.next();
        Set<String> set = new HashSet<>();
        String prev = "";
        for (int i = 0; i < N; ++i) {
            String cur = arr[i];
            if (i > 0 && (prev.charAt(prev.length() - 1) != cur.charAt(0) || set.contains(cur))) {
                System.out.println("No");
                return;
            }
            prev = cur;
        }

        System.out.println("Yes");
    }
}
