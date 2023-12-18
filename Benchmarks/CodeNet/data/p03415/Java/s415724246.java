import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            char[] line = scanner.nextLine().toCharArray();
            for (int j = 0; j < 3; j++) {
                if (i == j) sb.append(line[j]);
            }
        }

        System.out.println(sb.toString());
    }
}
