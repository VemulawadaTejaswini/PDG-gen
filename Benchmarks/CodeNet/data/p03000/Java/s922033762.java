import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();

        int sum = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            int l = scanner.nextInt();
            sum += l;
            if (index == 0 && sum > x) {
                index = i;
            }
        }
        if (index == 0) {
            System.out.println(n + 1);
        } else {
            System.out.println(index + 1);
        }
    }
}
