import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<Integer> votes = new ArrayList<>();
        int total = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            votes.add(a);
            total += a;
        }
        Collections.sort(votes, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.intValue() - o1.intValue();
            }
        });

        int target = votes.get(m - 1);
        double threshold = (total * 1.0d) / (m * 4);
        if ((target * 1.0d) >= threshold) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
