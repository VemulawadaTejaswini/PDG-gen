import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();

        int ok = 0;
        int ng = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == 'W') {
                ok++;
            } else {
                ng++;
            }
        }

        int min = ng;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == 'E') {
                ng--;
            } else {
                ok--;
            }

            if (s.charAt(i - 1) == 'E') {
                ok++;
            } else {
                ng++;
            }

            min = Math.min(min, ng);
        }

        System.out.println(min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
