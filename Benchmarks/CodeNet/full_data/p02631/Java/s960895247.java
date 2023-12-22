import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Long> list = new ArrayList<>();
        Map<Integer, Long> originmap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            long a = scanner.nextLong();
            list.add(a);
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (!originmap.containsKey(j)) {
                    originmap.put(j, a);
                } else {
                    originmap.put(j, originmap.get(j) ^ a);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            long origin = originmap.get(i);
            System.out.print(origin);
        }
        System.out.println();

    }
}