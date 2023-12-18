import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> time = new LinkedList<>();
        List<Integer> dueDate = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            time.add(sc.nextInt());
            dueDate.add(sc.nextInt());
        }

        int now = 0;
        int minDateNum = Integer.MAX_VALUE;

        while (!time.isEmpty()) {
            int minDate = Integer.MAX_VALUE;
            for (int i = 0; i < dueDate.size(); i++) {
                if (minDate > dueDate.get(i)) {
                    minDate = dueDate.get(i);
                    minDateNum = i;
                }
            }
            if (now + time.get(minDateNum) > minDate) {
                System.out.println("No");
                return;
            }
            now += time.get(minDateNum);
            time.remove(minDateNum);
            dueDate.remove(minDateNum);
        }

        System.out.println("Yes");

    }
}
