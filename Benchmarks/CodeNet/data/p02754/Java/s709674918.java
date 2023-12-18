import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long A = scanner.nextLong();
        long B = scanner.nextLong();

        long numberOfBToAdd = N / (A + B);

        long answer = numberOfBToAdd * A;
        long additional = N % (A + B);
        answer += additional;
        System.out.println(answer);
    }
}