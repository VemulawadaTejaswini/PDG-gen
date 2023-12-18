import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());

        int maxLength = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int l = Integer.parseInt(scanner.next());;
            if (maxLength < l) {
                maxLength = l;
            }
            sum += l;
        }
        scanner.close();

        boolean valid = maxLength < (sum - maxLength);

        System.out.println(valid ? "Yes" : "No");
    }
}
