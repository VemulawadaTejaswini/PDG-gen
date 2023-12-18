import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] food = new int[m];
        for (int i = 0; i < m; i++) {
            food[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            Set<Integer> set = new HashSet();
            for (int j = 0; j < k; j++) {
                set.add(sc.nextInt() - 1);
            }
            for (int j = 0; j < m; j++) {
                if (!set.contains(j)) food[j] = 0;
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            if (food[i] == 1) count++;
        }

        System.out.println(count);
    }
}