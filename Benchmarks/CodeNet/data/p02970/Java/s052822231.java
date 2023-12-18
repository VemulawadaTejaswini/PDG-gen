import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] values = scanner.nextLine().split(" ");
        int N = Integer.parseInt(values[0]);
        int D = Integer.parseInt(values[1]);

        int count = 0;
        while (true) {

            N = N - (2 * D + 1);

            if (N > 0) {
                count++;
            } else {
                count++;
                break;
            }

        }

        System.out.println(count);

        scanner.close();

    }

}
