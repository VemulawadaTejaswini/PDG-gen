import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final double x = sc.nextDouble();

        for (int i = -64; i <= 64; i++) {
            for (int j = -64; j <= 64; j++) {
                if (x == (Math.pow(i, 5) - Math.pow(j, 5))) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
}
