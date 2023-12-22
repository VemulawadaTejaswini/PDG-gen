import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.next();

        int n = 0;

        for (int i = 0; i < x.length(); i++) {
            n += Character.forDigit(x.charAt(i), 10);
        }

        if (n % 9 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();

        }

    }

