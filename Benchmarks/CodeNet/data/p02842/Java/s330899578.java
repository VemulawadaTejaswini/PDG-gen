import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int ans = (int)Math.ceil(N / 1.08);
        int check = (int)(ans * 1.08);
        if(check != N) {
            System.out.println(":(");
            return;
        }

        System.out.println(ans);
    }
}