import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kindsOfFlowers = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int answer = 0;
        if (a != 1 && b != 1) {
            answer += kindsOfFlowers;
        }
        if (a != kindsOfFlowers && b != kindsOfFlowers) {
            answer += 1;
        }
        for (int i = 2; i < kindsOfFlowers; i++) {
            if (i != a && i != b) {
                double last = kindsOfFlowers - i + 1;
                answer += (last / 2 * (1 + last));
            }
        }
        System.out.println(answer);
    }
}