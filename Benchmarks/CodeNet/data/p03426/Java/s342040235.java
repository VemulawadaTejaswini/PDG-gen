
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
    }
    public Main(){
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
            int L = s.nextInt() - 1;
            int R = s.nextInt() - 1;
            for(; L != R; L += D){
                pow += Math.abs(x[L + D] - x[L]) + Math.abs(y[L + D] - y[L]);
            }
            System.out.println(pow);
        }
        
    }
}
