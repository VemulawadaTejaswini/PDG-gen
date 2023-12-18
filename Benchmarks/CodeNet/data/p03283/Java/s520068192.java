import java.util.*;
import java.lang.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int Q = scan.nextInt();
        short[][] LR = new short[N][N];

        for(int i = 0; i < M; i++){
            short l = scan.nextShort();
            short r = scan.nextShort();
            for(short j = 1; j <= l; j++)
                for(short k = r; k <= N; k++)
                    LR[j-1][k-1]++;
        }

        int p, q, count;
        for(int i = 0; i < Q; i++){
            p = scan.nextInt();
            q = scan.nextInt();
            System.out.println(LR[p-1][q-1]);
        }
    }
}
