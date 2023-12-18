import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int numberOfBToAdd = N / (A + B);

        int answer = numberOfBToAdd * A;
        int additional = N % (A + B);
        answer += additional;
        System.out.println(answer);
    }
}
