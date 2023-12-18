import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long inputHorizontal = scanner.nextLong();
        long inputVertical = scanner.nextLong();
        if (inputHorizontal != 1 && inputVertical != 1) {
            long kakezan = inputHorizontal * inputVertical;
            long answer = kakezan / 2;
            if (kakezan % 2 != 0) {
                answer += 1;
            }
            System.out.println(answer);
        } else {
            System.out.println(1);
        }
    }
}
