import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        if(X >= 2 * Y) {
            System.out.println("No");
            return;
        }
        for(int i = 0; i <= X; i++) {
            if(Y == (i * 2) + ((X - i) * 4)){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}