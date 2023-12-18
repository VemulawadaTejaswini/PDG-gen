import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = A; i < A + K && i <= B; i++) {
            list.add(i);
        }

        for (int i = B; i > B - K && i >= A; i--) {
            if (list.contains(i)) continue;

            list.add(i);
        }

        Collections.sort(list);

        for (int i : list) {
            System.out.println(i);
        }
    }
}