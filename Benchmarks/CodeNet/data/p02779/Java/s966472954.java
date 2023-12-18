import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            set.add(a[i]);
        }
        if (set.size() == n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}