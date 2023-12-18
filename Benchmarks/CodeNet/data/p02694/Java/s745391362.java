import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long X = sc.nextLong();
        long count = 0;
        double Yokin = 100;
        double Kinri = 1.01;

        while (Yokin < X) {
            Yokin = Yokin*Kinri;
            Yokin = Math.floor(Yokin);
            count++;
        }
        System.out.println(count);
    }
}