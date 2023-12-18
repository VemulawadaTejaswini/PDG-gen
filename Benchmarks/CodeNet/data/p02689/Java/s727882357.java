import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] H = new int[N];
        for(int n=0; n<N; n++) H[n] = sc.nextInt();

        boolean[] highest = new boolean[N];
        Arrays.fill(highest, true);

        for(int m=0; m<M; m++){
            int A = sc.nextInt()-1;
            int B = sc.nextInt()-1;
            if(H[A] <= H[B]) highest[A] =false;
            if(H[A] >= H[B]) highest[B] =false;
        }

        int ans = 0;
        for(int n=0; n<N; n++) if(highest[n]) ans++;
        System.out.println(ans);
    }
}
