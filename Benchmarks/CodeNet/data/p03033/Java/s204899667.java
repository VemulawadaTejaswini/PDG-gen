import java.util.*;
 
public class Main {
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[]$) {
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        Set<int[]> list = new TreeSet<>(Comparator.comparingInt(array -> array[0]));
        for (int i = 1; i <= n; i++) {
            int s = Integer.parseInt(scanner.next());
            int t = Integer.parseInt(scanner.next());
            int x = Integer.parseInt(scanner.next());
            list.add(new int[] {s - x, x, -1});
            list.add(new int[] {t - x, x, -2});
        }
        int[] ans = new int[q];
        for (int i = 0; i < q; i++) {
            list.add(new int[] {Integer.parseInt(scanner.next()), 0, i});
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int[] s : list) {
            if (s[2] == -1) {
                set.add(s[1]);
            } else if (s[2] == -2) {
                set.remove(s[1]);
            } else {
                ans[s[2]] = set.isEmpty() ? -1 : set.first();
            }
        }
 
        Arrays.stream(ans).forEach(System.out::println);
    }
}