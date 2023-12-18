import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> sKouho = new ArrayList<>();
        ArrayList<Integer> eKouho = new ArrayList<>();

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

        for (Integer v: sKouho
             ) {
            if (eKouho.contains(v)) {
                ans = "POSSIBLE";
                break;
            }
        }

        System.out.println(ans);
    }
}