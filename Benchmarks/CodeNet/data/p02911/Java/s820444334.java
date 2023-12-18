import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine();
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<q;i++) {
            list.add(sc.nextInt());
            sc.nextLine();
        }
        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(m -> m, Collectors.counting()));
        for (int i = 1; i<=n; i++) {
            if (q - map.getOrDefault(i, (long) 0) < k) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
