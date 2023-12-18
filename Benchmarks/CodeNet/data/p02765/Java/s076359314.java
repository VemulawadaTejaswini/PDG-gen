import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int R = sc.nextInt();
            System.out.println(R + (100 * (10 - N)));
        }
    }
}
