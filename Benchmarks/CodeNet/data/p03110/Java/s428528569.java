import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Double> x = new ArrayList<>();
        List<String> u = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            x.add(sc.nextDouble());
            u.add(sc.next());
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            if ("BTC".equals(u.get(i))) {
                sum += x.get(i) * 380000.0;
                continue;
            }
            sum += x.get(i);
        }
        System.out.println(sum);
    }

}
