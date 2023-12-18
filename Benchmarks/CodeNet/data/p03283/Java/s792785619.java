import java.util.*;
import java.lang.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int Q = scan.nextInt();
        short[] L = new short[M];
        short[] R = new short[M];

        for(int i = 0; i < M; i++){
            L[i] = scan.nextShort();
            R[i] = scan.nextShort();
        }
        int p, q, count;
        for(int i = 0; i < Q; i++){
            p = scan.nextInt();
            q = scan.nextInt();
            count = 0;
            for(int j = 0; j < M; j++)
                if(L[j] >= p && R[j] <= q)count++;
            System.out.println(count);
        }
    }
}
