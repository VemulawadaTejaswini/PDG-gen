import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();

        if (N == 0){
            System.out.println(X);
            return;
        }

        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = scanner.nextInt();
        }

        int L = X, R = X;
        boolean C;
        while(true){
            C = true;
            for (int i = 0; i < N; i++) {
                if(P[i] == L){
                    C = false;
                    L--;
                    break;
                }
            }
            if(C){
                System.out.println(L);
                break;
            }

            C = true;
            for (int i = 0; i < N; i++) {
                if(P[i] == R){
                    C = false;
                    R++;
                    break;
                }
            }
            if(C){
                System.out.println(R);
                break;
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
