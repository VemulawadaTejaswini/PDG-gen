import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLong());
        }
        int count = 0;
        for (int j = 0; j < list.size(); j++) {
            int finalJ = j;
            if (list.subList(0, finalJ).stream().allMatch(m -> m > list.get(finalJ))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
