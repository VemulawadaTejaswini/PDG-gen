import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int D = scanner.nextInt();

        int ans = 0;

        for(int m = 1; m <= M; m++) {
            for (int d = 1; d <= D; d++) {
                if(m == (d % 10) * (d / 10) && (d % 10) >= 2 && (d / 10) >= 2)  {
                    ans++;
                }
            }
        }

        System.out.println(ans);

    }
}
