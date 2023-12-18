import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();

        StringBuilder sb = new StringBuilder("Christmas");

        for (int i = 0; i < 25 - day; i++) {
            sb.append(" Eve");
        }

        System.out.println(sb.toString());
    }
}