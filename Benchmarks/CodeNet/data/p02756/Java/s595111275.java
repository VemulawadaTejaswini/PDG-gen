import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.next());
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int t = scanner.nextInt();
            if (t == 1) {
                sb.reverse();
            } else if (t == 2) {
                int f = scanner.nextInt();
                if (f == 1) {
                    sb.insert(0, scanner.next());
                } else {
                    sb.append(scanner.next());
                }
            }
        }
        System.out.println(sb.toString());
    }
}