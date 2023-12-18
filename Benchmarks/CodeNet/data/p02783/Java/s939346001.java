import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int A = scanner.nextInt();

        int num = 0;
        for(int i =0; i < 100001; i++) {
            num++;
            H -= A;
            if(H <= 0) break;
        }

        System.out.println(num);
    }
}
