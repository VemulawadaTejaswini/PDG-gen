import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] homework = scanner.nextLine().split(" ");
        String[] days =scanner.nextLine().split(" ");
        int daySum = Arrays.stream(days).mapToInt(Integer::parseInt).sum();
        int d = Integer.parseInt(homework[0]) - daySum;
        if (d < 0) {
            System.out.println(-1);
        }else {
            System.out.println(d);
        }
    }
}