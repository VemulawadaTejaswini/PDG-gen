import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        char[] chars = sc.next().toCharArray();
        if (N % 2 != 0) {
            System.out.println("No");
            return;
        }

        for (int i = 0; i < N / 2; i++) {
            if (chars[i] != chars[N / 2 + i]) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}