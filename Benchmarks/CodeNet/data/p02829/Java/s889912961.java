
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int X;
        int Y;

        try (Scanner sc = new Scanner(System.in)) {
            X = sc.nextInt();
            Y = sc.nextInt();
        }
        System.out.println( 6 - (X+Y));
        

    }


}
