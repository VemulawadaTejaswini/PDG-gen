import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int q = scanner.nextInt();
            String s = scanner.nextLine();
            for (int i = 0; i < q; i++) {
                int L = scanner.nextInt();
                int R = scanner.nextInt();
                int count = 0;
                // ACACTACG
                // 01234567
                for(int j = L - 1; j < R - 1; j++) {
                    if (s.charAt(j) == 'A' && s.charAt(j + 1) == 'C') {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
