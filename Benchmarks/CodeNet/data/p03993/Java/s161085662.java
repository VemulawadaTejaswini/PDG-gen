import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        Set<Integer> ignore = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            if (ignore.contains(i)) continue;
            if (i == a[a[i]]) {
                count++;
                ignore.add(a[i]);
            }
        }
        System.out.println(count);
    }
}
