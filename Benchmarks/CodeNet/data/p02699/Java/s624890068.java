import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sheep = scanner.nextInt();
        int wolf = scanner.nextInt();
        scanner.close();

        System.out.println(sheep <= wolf ? "unsafe" : "safe");

    }
}