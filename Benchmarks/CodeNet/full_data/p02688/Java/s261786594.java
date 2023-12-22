import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            for (int j = 0; j < a; j++) {
                set.add(sc.nextInt());
            }
        }

        System.out.println(n - set.size());

        sc.close();
    }

}