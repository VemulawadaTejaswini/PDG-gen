import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] k = new int[N];
        for(int i = 0; i < N; i++) {
            k[i] = -1;
        }
        int ret = 0;
        for(int i = 0; i < M; i++) {
            int s = scanner.nextInt() - 1;
            int c = scanner.nextInt();
            if(k[s] != -1 && k[s] != c ) {
                ret = -1;
            }
            if(N > 1 && s == 0 && c == 0) {
                ret = -1;
            }
            k[s] = c;
        }
        if(ret == -1) {
            System.out.println(ret);
            return;
        }

        boolean flg = false;

        if(N == 1) {
            if(k[0] == -1) {
                System.out.print(0);
            }else{
                System.out.print(k[0]);
            }
            return;
        } else if(N == 2) {
            if(k[0] == 0) {
                System.out.print(-1);
                return;
            } else if(k[0] == -1) {
                System.out.print(1);
            }else{
                System.out.print(k[0]);
            }

            if(k[1] == -1) {
                System.out.print(0);
            }else{
                System.out.print(k[1]);
            }
            return;

        } else {
            if(k[0] == 0) {
                System.out.print(-1);
                return;
            } else if(k[0] == -1) {
                System.out.print(1);
            }else{
                System.out.print(k[0]);
            }

            if(k[1] == -1) {
                System.out.print(0);
            }else{
                System.out.print(k[1]);
            }

            if(k[2] == -1) {
                System.out.print(0);
            }else{
                System.out.print(k[2]);
            }
        }
    }
}
