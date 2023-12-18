import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLong());
        }
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            long a = list.get(i);
            for (int j = i + 1; j < n; j++) {
                sum += a ^ list.get(j);
            }
        }
        int x = 1000000000 + 7;
        System.out.println(sum % x);
    }

}
