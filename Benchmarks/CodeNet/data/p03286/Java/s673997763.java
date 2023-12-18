import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        do {
            if (n < 0) {
                sb.append(-n % 2);
                n = (n + n % 2) / -2;
            } else {
                sb.append(n % 2);
                n = n / -2;
            }
        } while (n != 0);
        System.out.println(sb.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
