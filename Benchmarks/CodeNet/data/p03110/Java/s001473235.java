import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double num = Double.parseDouble(sc.next());
            String key = sc.next();
            if (key.equals("JPY")) {
                sum += num;
            } else {
                sum += num * 380000.0;
            }
        }
        System.out.println(sum);

    }
}