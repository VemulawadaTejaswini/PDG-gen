import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x, result = 0;
        while (true) {
            n = sc.nextInt();
            x = sc.nextInt();
            if (n == 0 && x == 0) break;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if ((i + j + k) == x) result++;
                    }
                }
            }
            System.out.println(result);
            result = 0;
        }

    }
}

