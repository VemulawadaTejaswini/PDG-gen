
import java.util.Scanner;

public class Main {
    
    private static int abs(int n){
        return n > 0 ? n : -n;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int H = s.nextInt(), W = s.nextInt(), D = s.nextInt();
        int x[] = new int[H*W], y[] = new int[H*W];
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                int num = s.nextInt() - 1;
                x[num] = i + 1;
                y[num] = j + 1;
            }
        }
        int Q = s.nextInt();
        for(int i = 0; i < Q; i++){
            int pow = 0;
            int L = s.nextInt();
            int R = s.nextInt();
            while(L != R){
                pow += abs(x[L + D - 1] - x[L - 1]) + abs(y[L + D - 1] - y[L - 1]);
                L += D;
            }
            System.out.println(pow);
        }
    }
}
