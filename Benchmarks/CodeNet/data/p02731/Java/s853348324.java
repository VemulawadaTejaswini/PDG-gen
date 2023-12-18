import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int L = sc.nextInt();
            System.out.println(Math.pow(L / 3.0, 3.0));
        }
    }
}