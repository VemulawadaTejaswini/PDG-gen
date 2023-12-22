import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int i = 0;
        while (true) {
            i++;
            if ((360 * i) % X == 0) {
                System.out.println((360 * i) / X);
                return;
            }
        }
    }
}
