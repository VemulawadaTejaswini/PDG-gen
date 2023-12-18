import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] x = new String[n];
        String[] u = new String[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.next();
            u[i] = sc.next();
        }

        double result = 0;
        for (int i = 0; i < n; i++) {
            if ("JPY".equals(u[i])) {
                result += Integer.parseInt(x[i]);
            }else {
                result += Double.parseDouble(x[i]) * 380000.0;
            }
        }

        System.out.println(result);
    }
}