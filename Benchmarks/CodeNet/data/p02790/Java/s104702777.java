import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int cnt = scanner.nextInt();

        for (int i=0; i<cnt; i++) {
            System.out.print(str);
        }
    }
}