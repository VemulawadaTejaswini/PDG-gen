import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt();
        String c = scn.next();

        //RRR....RWW...WWW にする
        int ans = N;
        int w, r;
        for(int i = 0; i < N+1; i++) {
            w = 0; r = 0;
            for(int j = 0; j < N; j++) {
                if(j <= i-1 && c.charAt(j) == 'W') w++;
                if(j >  i-1 && c.charAt(j) == 'R') r++;
            }

            if(w == N || r == N) {
               ans = 0; break;
            }else{
                if(w <= r) ans = Math.min(ans, r);
                if(w >  r) ans = Math.min(ans, w);
            }
        }
        
        System.out.println(ans);
    }
}