import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        if (n == 1) {
            System.out.println(1);
        } else {
            double count = 0;
            for (int i = 1; i <= n; i++) {
                if ((i % 2) == 0) {
                    continue;
                }
                count++;
            }
            System.out.println(count / n);
        }
        sc.close();
    }
}
