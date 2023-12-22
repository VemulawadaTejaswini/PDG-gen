import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String x = sc.next();

        StringBuilder sb = new StringBuilder();
        sb.append(x);

        if (x.length() <= n) {
            System.out.println(x);
        } else {
            System.out.println(x.substring(0, n) + "...");
        }

        sc.close();
    }

}
