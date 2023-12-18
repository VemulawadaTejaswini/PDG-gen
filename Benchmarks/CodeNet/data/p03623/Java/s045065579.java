import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int x = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(Math.abs(a - x) < Math.abs(b - x) ? "A" : "B");
        }
    }
}
