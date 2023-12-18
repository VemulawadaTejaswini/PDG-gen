import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < m; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            while (b-- > 0) {
                list.add(c);
            }
        }

        Collections.sort(list, Collections.reverseOrder());
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (long)list.get(i);
        }
        System.out.println(sum);
    }
}
