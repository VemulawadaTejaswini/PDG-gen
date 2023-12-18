import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i <= 16; i++) {
            if (i%2 == 0) {
                a--;
            } else {
                b--;
            }
        }

        if (a <= 0 && b <= 0) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }
}
