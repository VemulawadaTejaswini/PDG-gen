import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        PriorityQueue<Integer> sKouho = new PriorityQueue<>();
        PriorityQueue<Integer> eKouho = new PriorityQueue<>();

        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            if (s == 1) {
                sKouho.add(e);
            } else if (e == n) {
                eKouho.add(s);
            }
        }

        String ans = "IMPOSSIBLE";

        int count = sKouho.size();

        for (int i = 0; i < count; i++) {
            if (eKouho.contains(sKouho.poll())) {
                ans = "POSSIBLE";
                break;
            }
        }

        System.out.println(ans);
    }
}