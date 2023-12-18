import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String w[] = new String[n];
        for (int i = 0; i < n; i++) {
            w[i] = in.next();
        }

        for (int i = 1; i < n; i++) {
            if (w[i - 1].charAt(w[i - 1].length() - 1) != w[i].charAt(0)) {
                System.out.println("No");
                return;
            }

            for (int j = 0; j < i; j++) {
                if (w[i].equals(w[j])) {
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");
    }
}
