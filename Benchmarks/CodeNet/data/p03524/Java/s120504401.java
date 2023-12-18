import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int[] a = new int[3];
        for (int i = 0; i < s.length; i++) {
            int x = s[i] - 'a';
            a[x]++;
        }
        int max = Math.max(a[0], Math.max(a[1], a[2]));
        int min = Math.min(a[0], Math.min(a[1], a[2]));
        System.out.println(max-min < 2 ? "YES" : "NO");
        sc.close();

    }

}
