import java.util.Scanner;
import java.util.Arrays;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        int h = scan.nextInt();
        int w = scan.nextInt();

        int All = H * W;

        int kasanari = (H-h) * (W - w);

        

        System.out.println(kasanari);
    }
}