import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            while(scn.hasNextInt()) {
                int a = scn.nextInt(), b = scn.nextInt();
                System.out.println(euclid(Math.max(a, b), Math.min(a, b)));
            }
        }
    }

    private static int euclid(int a, int b) {
        return a % b == 0 ? b : euclid(b, a % b);
    }
}