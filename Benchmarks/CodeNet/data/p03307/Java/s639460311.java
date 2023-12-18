import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            int answer;
            if (n % 2 == 0) {
                answer = n;
            } else {
                answer = n * 2;
            }
            System.out.println(answer);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}