import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] t = new boolean[n];
        Arrays.fill(t, true);

        for (int i = 0; i < n; i++) {
            int test = sc.nextInt();

            for (int j = 0; j < test; j++) {
                int person = sc.nextInt()-1;
                int type = sc.nextInt();

                if (type == 0) {
                    t[person] = false;
                }
            }
        }
        int count = 0;
        for (boolean b : t) {
            if (b) count++;
        }
        System.out.println(count);
    }
}