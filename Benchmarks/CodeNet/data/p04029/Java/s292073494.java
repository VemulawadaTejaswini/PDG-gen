import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        scanner.close();

        int result = 0;
        for (int i = 1; i <= N; i++) {
            result += i;
        }

        System.out.println(result);
    }
}
