import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();

        System.out.println((double)R * 2 * 3.141592653);
        return;
    }
}