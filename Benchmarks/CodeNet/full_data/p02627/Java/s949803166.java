import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        char N = scanner.next().toCharArray()[0];
        if(N >= 'a' && N <= 'z') {
            System.out.println('a');
            return;
        }
        System.out.println('A');

    }
}
