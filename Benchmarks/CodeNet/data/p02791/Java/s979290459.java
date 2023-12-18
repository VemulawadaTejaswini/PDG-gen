import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Integer.parseInt(scanner.next());
            int p = Integer.MAX_VALUE;
            int r = 0;
            for (int i = 0; i < n; i++) {
                int pp = Integer.parseInt(scanner.next());
                if (pp <= p)
                    r++;
                p = Integer.min(p, pp);
            }
            System.out.println(r);
        }
    }

}
