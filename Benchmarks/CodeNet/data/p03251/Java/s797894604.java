import java.util.*;

public class Main {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int X = scan.nextInt();
        int Y = scan.nextInt();

        int x;
        int max_x = 0;
        for (int i = 0; i < N; i++) {
            x = scan.nextInt();
            if (max_x < x) {
                max_x = x;
            }
        }
        int y;
        int max_y = 0;
        for (int i = 0; i < M; i++) {
            y = scan.nextInt();
            if (max_y < y) {
                max_y = y;
            }
        }

        Boolean war = true;
        for (int Z = X + 1; Z < Y; Z++) {
            if (max_x < Z && max_y >= Z) {
                war = false;
            }
        }

        if (war) {
            System.out.println("War");
        }
        else {
            System.out.println("No War");
        }
    }
}