import java.awt.Dimension;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
    }
    public Main(){
        Scanner s = new Scanner(System.in);
        
        int H = s.nextInt(), W = s.nextInt(), D = s.nextInt();
        Dimension map[] = new Dimension[H*W];
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                map[s.nextInt()-1] = new Dimension(i+1, j+1);
            }
        }
        int Q = s.nextInt();
        for(int i = 0; i < Q; i++){
            int pow = 0;
            int L = s.nextInt() - 1;
            int R = s.nextInt() - 1;
            for(; L != R; L += D){
                Dimension p1 = map[L], p2 = map[L + D];
                pow += Math.abs(p2.height - p1.height) + Math.abs(p2.width - p1.width);
            }
            System.out.println(pow);
        }
        
    }
}
