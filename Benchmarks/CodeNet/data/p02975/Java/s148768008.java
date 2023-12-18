
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] a = new long[N];
        for(int i = 0; i < N; i ++) {
            a[i] = scanner.nextInt();
        }
        boolean ans = true;

        for(int i = 0; i < N; i ++) {
            long hoge = a[(N+i-1) % N] ^ a[(i+1) % N];
            if(hoge != a[i]){
                ans = false;
                break;
            }
        }
        if(ans) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
