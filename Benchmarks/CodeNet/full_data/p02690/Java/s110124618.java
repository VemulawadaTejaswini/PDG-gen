import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final double x = sc.nextDouble();

        for (int i = -128; i <= 128; i++) {
            for (int j = -128; j <= 128; j++) {
                if (x == (Math.pow(i, 5) - Math.pow(j, 5))) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
}
