import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int seikai = 0;
        int pena = 0;
        int[] ans = new int[N+1];

        for(int i = 0; i < M; i++) {
            int mon = scanner.nextInt();
            String act = scanner.next();
            if(act.equals("WA") && ans[mon] == 0) {
                pena++;
            }else if(act.equals("AC") && ans[mon] == 0) {
                ans[mon] = 1;
                seikai++;
            }
        }
        System.out.println(seikai);
        System.out.println(pena);
    }
}