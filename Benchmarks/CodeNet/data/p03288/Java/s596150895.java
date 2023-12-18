import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int R = in.nextInt();
            System.out.println(R < 1200 ? "ABC" : R < 2800 ? "ARC" : "AGC");
        }
    }
}
