import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            num.add(sc.nextInt());
        }
        Collections.sort(num,Collections.reverseOrder());
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a += num.get(i);
            } else {
                b += num.get(i);
            }
        }
        System.out.println(a - b);
    }
}