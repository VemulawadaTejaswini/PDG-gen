import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] p = new int[M];
        String[] S = new String[M];
        String A = "AC";
        String W = "WA";
        int ac = 0;
        int wa = 0;
        String[] sn = new String[N+1];
        int[] wn = new int[N+1];

        for(int i=0; i<=N; i++){
            sn[i] = "A";
            wn[i] = 0;
        }

        for(int i=0; i<M; i++){
            p[i] = sc.nextInt();
            S[i] = sc.next();
            if(S[i].equals(W) && !sn[p[i]].equals(A)){
                sn[p[i]] = W;
                wn[p[i]] += 1;
            }
            else if(!sn[p[i]].equals(A)){
                sn[p[i]] = A;
                ac += 1;
            }
        }

        for(int i=1; i<=N; i++){
            wa += wn[i];
        }

        System.out.println(ac + " " + wa);
    }
}
