import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
            int d = scn.nextInt();
            int p = scn.nextInt();
            int x = a * p;
            int y = p < c ? b : b + (p - c) * d;
            System.out.println(x < y ? x : y);
        }
    }
}