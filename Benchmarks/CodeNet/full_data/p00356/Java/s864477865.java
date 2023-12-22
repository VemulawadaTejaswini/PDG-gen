
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int X = x;
        int Y = y;
        while (!(X % Y == 0)) {
            int Z = X;
            X = Y;
            Y = Z % Y;
        }
        int d = x/Y;
        int w = y/Y;
        System.out.println(((w+d)*Y)-(Y-1));
        
    }

}

