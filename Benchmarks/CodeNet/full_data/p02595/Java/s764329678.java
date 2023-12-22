import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D = scanner.nextInt();

        int R = 0;
        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            if (X*X + Y*Y <= D*D){
                R++;
            }
        }
        
        System.out.println(R);
    }

    public static void main(String[] args) {
        new Main();
    }
}