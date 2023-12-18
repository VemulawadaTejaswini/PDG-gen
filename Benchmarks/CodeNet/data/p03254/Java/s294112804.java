import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int[] ary = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(ary);
        for (int i = 0; i < n; i++) {
            if (x < ary[i]) {
                break;
            } else {
                x -= ary[i];
                ans = i +1;
            }

        }
        System.out.println(ans);
    }
}