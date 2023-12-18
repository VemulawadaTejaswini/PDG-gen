import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Integer.parseInt(scanner.next());
            int[] p = new int[n];
            int r = 0;
            for (int i = 0; i < n; i++) {
                p[i] = Integer.parseInt(scanner.next());
                boolean b = true;
                for (int j = 0; j < i; j++) {
                    if (p[j] < p[i]) {
                        b = false;
                        break;
                    }
                }
                if (b)
                    r++;
            }
            System.out.println(r);
        }
    }

}
