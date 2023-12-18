import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

    static int N;
    static int K;
    static int Q;
    static int A;
    static long B;
    static long C;
    //    static int[][] map;
    static int min = 9999999;
    static long ans = 0;


    static class pair implements Comparable{
            public int a;
            public int b;

            pair(){
                this.a = 0;
                this.b = 0;
            }

            pair(int a, int b){
                this.a = a;
                this.b = b;
            }

            public void set(int a, int b) {
                this.a = a;
                this.b = b;
            }

        @Override
        public int compareTo(Object o) {
            pair c = (pair) o;

            if(this.a > c.a)return 1;
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] mapa = new int[N / 2];
        int[] mapb = new int[N / 2];
        for (int i = 0; i < N; i++) {
            if(i % 2 == 0){
                mapa[i / 2] = scanner.nextInt();

            }else{
                mapb[i / 2] = scanner.nextInt();
            }
        }

        int ans = 847397870;

        Arrays.sort(mapa);
        Arrays.sort(mapb);
        int amax = 0;
        int amaxnum = -1;
        int old = mapa[0];
        int cnt = 1;
        for (int i = 1; i < N / 2; i++) {
            if(old == mapa[i]){
                cnt++;
            }else{
                amax = Math.max(amax, cnt);
                if(amax == cnt) amaxnum = mapa[i - 1];
                cnt = 1;
            }
            old = mapa[i];
        }
//        System.out.println("cnt = " + cnt);
        amax = Math.max(amax, cnt);
//        System.out.println(amax);
        if(amax == cnt) amaxnum = old;

//        System.out.println(amaxnum);
        int bmax = 0;
        old = mapb[0];
        cnt = 1;
        for (int i = 1; i < N / 2; i++) {
            if(old == mapb[i]){
                cnt++;
            }else{
//                System.out.println(mapb[i - 1] + " " + cnt);
                if(amaxnum != mapb[i - 1])bmax = Math.max(bmax, cnt);
                cnt = 1;
            }
            old = mapb[i];
        }
//        System.out.println(bmax);
        if(amaxnum != old)bmax = Math.max(bmax, cnt);
//        System.out.println(amax + " " + bmax);

        ans = Math.min(ans, N - amax - bmax);

        int cmax = 0;
        amaxnum = -1;
        old = mapb[0];
        cnt = 1;
        for (int i = 1; i < N / 2; i++) {
            if(old == mapb[i]){
                cnt++;
            }else{
                cmax = Math.max(cmax, cnt);
                if(cmax == cnt) amaxnum = mapb[i - 1];
                cnt = 1;
            }
            old = mapb[i];
        }
        cmax = Math.max(cmax, cnt);
        if(cmax == cnt) amaxnum = old;

        int dmax = 0;
        old = mapa[0];
        cnt = 1;
        for (int i = 1; i < N / 2; i++) {
            if(old == mapa[i]){
                cnt++;
            }else{
                if(amaxnum != mapa[i - 1])dmax = Math.max(dmax, cnt);
                cnt = 1;
            }
            old = mapa[i];
        }
        if(amaxnum != old)dmax = Math.max(dmax, cnt);

        ans = Math.min(ans, N - cmax - dmax);




//        System.out.println(cmax + " " + dmax);

        System.out.println(ans);
    }
}

