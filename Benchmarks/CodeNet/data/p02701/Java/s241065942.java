import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputs = "";
        int count = 0;
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            String temp = scanner.next();
            if (!inputs.contains(temp)) {
                count++;
                inputs += temp;
            }

        }

        scanner.close();

        System.out.println(count);

    }
}