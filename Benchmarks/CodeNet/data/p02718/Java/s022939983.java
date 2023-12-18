import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        if (m > n || m == 0) {
            System.out.println("No");
            return;
        }

        List<Integer> items = new ArrayList<>();

        int votes = 0;
        for (int i = 0; i < n; i++) {
            int vote = in.nextInt();
            votes += vote;
            items.add(vote);
        }

        int condition = (int) Math.ceil(votes / (4.0 * m));

        int checkCount = 0;
        Collections.sort(items, (o1, o2) -> o2 - o1);
        for (Integer check: items) {
            if (check >= condition && ++checkCount >= m) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");

    }

}