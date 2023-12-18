import java.util.Arrays;
import java.util.Scanner;

class B {
    public static void main(String...args) {
        final Scanner sc = new Scanner(System.in);
        final int[] cnt = new int[4];
        for(int i = 0; i < 3; i++) {
            cnt[sc.nextInt() - 1] ++;
            cnt[sc.nextInt() - 1]++;
        }
        Arrays.sort(cnt);
        System.out.println(Arrays.equals(cnt, new int[]{1, 1, 2, 2}) ? "YES" : "NO");
    }
}
public class Main {
    public static void main(String...args) {
        B.main();
    }
}
