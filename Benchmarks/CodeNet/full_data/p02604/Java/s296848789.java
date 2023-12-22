import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;

class AxisSN{
    long x;
    public AxisSN(long x){this.x = x;}
    long getX(){return x;}
    public String toString(){return "[x="+x+"]";}
}
class AxisEW{
    long y;
    public AxisEW(long y){this.y = y;}
    long getY(){return y;}
    public String toString(){return "[y="+y+"]";}
}
class Resident{
    long x, y;
    long p;
    public Resident(long x, long y, long p){
        this.x = x;
        this.y = y;
        this.p = p;
    }

    long getX(){return x;}
    long getY(){return y;}
    long getPopulation(){
        return p;
    }
    public long distanceTo(AxisSN axis){
        return Math.abs(axis.getX() - this.getX());
    }
    public long distanceTo(AxisEW axis){
        return Math.abs(axis.getY() - this.getY());
    }

    public String toString(){
        return "[<"+x+","+y+">/"+p+"]";
    }
}


public class Main {
    static long pow(int a, int n){
        long x = 1;
        for(int i=0; i<n; i++) x *= a;
        return x;
    }
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Resident[] resident = new Resident[N];
        // for(int n=0; n<N; n++){
        //     long x = sc.nextLong();
        //     long y = sc.nextLong();
        //     long p = sc.nextLong();
        //     resident[n] = new Resident(x,y,p);
        // }

        for(int n=0; n<N; n++){
            long x = random.nextInt(10000);
            long y = random.nextInt(10000);
            long p = random.nextInt(1000000);
            resident[n] = new Resident(x,y,p);
        }        

        AxisSN[] SN = new AxisSN[N+1];
        for(int n=0; n<N; n++) SN[n] = new AxisSN(resident[n].getX());
        SN[N] = new AxisSN(0);
        AxisEW[] EW = new AxisEW[N+1];
        for(int n=0; n<N; n++) EW[n] = new AxisEW(resident[n].getY());
        EW[N] = new AxisEW(0);


        long[] ans = new long[N+1];
        Arrays.fill(ans, Long.MAX_VALUE);

        for(long pattern = 0; pattern<pow(3,N); pattern++){
            long totalDistance = 0;
            String p = String.format("%15s", Long.toString(pattern, 3));
            int popCount = 0;
            for(int n=0; n<15; n++){
                if(p.charAt(n)=='1' || p.charAt(n)=='2') popCount++;
            }
            for(Resident r:resident){
                long distance = Math.min(r.distanceTo(SN[N]), r.distanceTo(EW[N]));
                for(int n=0; n<N; n++) if(p.charAt(14-n)=='1'){
                    //System.out.printf("%s ... %s : %d\n", r, EW[n]);
                    distance = Math.min(distance, r.distanceTo(EW[n]));
                } 
                for(int n=0; n<N; n++) if(p.charAt(14-n)=='2'){
                    //System.out.printf("%s ... %s : %d\n", r, SN[n]);
                    distance = Math.min(distance, r.distanceTo(SN[n]));
                } 
                totalDistance += distance * r.getPopulation();
            }
            ans[popCount] = Math.min(ans[popCount], totalDistance);
        }

        for(int n=0; n<=N; n++) System.out.println(ans[n]);
    }
}
