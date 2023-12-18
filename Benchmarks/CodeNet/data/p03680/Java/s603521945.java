import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] button = new int[n];
        for (int i = 0; i < n; i++) {
            button[i] = Integer.parseInt(sc.next());
        }
        int cnt = 1;
        int next = button[0];
        for (int i = 0; i < n; i++) {
            if (next == 2) {
                System.out.println(cnt);
                return;
            }
            if (button[next - 1] == 2) {
                cnt++;
                System.out.println(cnt);
                return;
            } else {
                next = button[next - 1];
                cnt++;
            }
        }
        System.out.println(-1);
    }
}
