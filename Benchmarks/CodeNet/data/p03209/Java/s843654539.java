import java.util.*;

public class Main {
    static long[] pnumInL;
    static long[] lenL;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        sc.close();

        pnumInL = new long[n+1];
        lenL = new long[n+1];
        pnumInL[0] = 1;
        lenL[0] = 1;
        for(int i=0; i<n; i++){
            pnumInL[i+1] = pnumInL[i] * 2 + 1;
            lenL[i+1] = lenL[i] * 2 + 3;
        }

        System.out.println(culcPnum(n, 1, x));
    }

    public static long culcPnum(int level, long start, long end){
        long mlen = end - start + 1;
        if(level == 0 && mlen == 1) return 1;
        if(mlen <= 1) return 0;
        if(mlen >= lenL[level]-1) return pnumInL[level];
        if(mlen >= lenL[level-1] + 2){
            return pnumInL[level-1] + 1 + culcPnum(level-1, start + lenL[level-1]+2, end);
        }else{
            return culcPnum(level-1, start+1, end);
        }
    }
}