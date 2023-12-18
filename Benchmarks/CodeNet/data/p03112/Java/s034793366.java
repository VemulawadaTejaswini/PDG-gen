import java.util.*;
        import java.io.*;

public class Main {
    static long INF = 5_000_000_000_000_000L;
    static long westNear(long[] facility, long point){
        int N = facility.length;
        if(point < facility[0]) return -INF;
        if(facility[N-1] <= point) return facility[N-1];
        int w=0, e=N-1;
        while(w+1<e){
            int m = (w+e)/2;
            if(facility[m] == point) return point;
            if(facility[m] < point) w=m;
            if(point < facility[m]) e=m;
        }
        return facility[w];
    }
    static long eastNear(long[] facility, long point){
        int N = facility.length;
        if(facility[N-1] < point) return INF;
        if(point <= facility[0]) return facility[0];
        int w=0, e=N-1;
        while(w+1<e){
            int m = (w+e)/2;
            if(facility[m] == point) return point;
            if(facility[m] < point) w=m;
            if(point < facility[m]) e=m;
        }
        return facility[e];
    }
    static long near(long[] facility, long point){
        long west = westNear(facility, point);
        long east = eastNear(facility, point);
        if(point-west > east-point) return east;
        else return west;
    }


    static long solve(long[] shrines, long[] temples, long x){
        long ans = INF;
        // west shrine -> temple
        long wShrine = westNear(shrines, x);
        //System.err.printf("%11d ", x-wShrine + Math.abs(near(temples, wShrine)-wShrine));
        ans = Math.min(ans, x-wShrine + Math.abs(near(temples, wShrine)-wShrine));

        // east shrine -> temple
        long eShrine = eastNear(shrines, x);
        //System.err.printf("%11d ", eShrine-x + Math.abs(near(temples, eShrine)-eShrine));
        ans = Math.min(ans, eShrine-x + Math.abs(near(temples, eShrine)-eShrine));

        // west temple -> shrine
        long wTemple = westNear(temples, x);
        //System.err.printf("%11d ", x-wTemple + Math.abs(near(shrines, wTemple)-wTemple));
        ans = Math.min(ans, x-wTemple + Math.abs(near(shrines, wTemple)-wTemple));

        // east shrine -> temple
        long eTemple = eastNear(temples, x);
        //System.err.printf("%11d\n", eTemple-x + Math.abs(near(shrines, eTemple)-eTemple));
        ans = Math.min(ans, eTemple-x + Math.abs(near(shrines, eTemple)-eTemple));

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int Q = sc.nextInt();
        long[] shrines = new long[A];
        long[] temples = new long[B];
        for(int a=0; a<A; a++) shrines[a] = sc.nextLong();
        for(int b=0; b<B; b++) temples[b] = sc.nextLong();
        for(int q=0; q<Q; q++){
            long x = sc.nextLong();
            System.out.println(solve(shrines, temples, x));
        }
    }
}