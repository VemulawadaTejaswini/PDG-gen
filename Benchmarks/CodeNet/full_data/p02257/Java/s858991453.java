import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int n = sc.nextInt();
        int count = 0;
        for (int k = 0; k < n; k++) {
            int a = sc.nextInt();
            for (i = 2;; i++) {
                for (j = 2; j < i; j++) {
                    if ((i % j) == 0) break;
                }
                if ((i == j) && (a == i)) {
                    count++;
                    break;
                }
                if (i > a) break;
            }
        }
        System.out.println(count);
        sc.close();
    }
}

