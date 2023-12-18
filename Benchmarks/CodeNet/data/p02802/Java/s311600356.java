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
        int[] sei = new int[N];

        for(int i = 0; i < M; i++) {
            int mon = scanner.nextInt();
            String act = scanner.next();
            if(act.equals("WA") && sei[mon-1] == 0) {
                pena++;
            }else if(act.equals("AC") && sei[mon-1] == 0) {
                sei[mon-1] = 1;
                seikai++;
            }
        }
        System.out.println(seikai + " " + pena);
    }
}
