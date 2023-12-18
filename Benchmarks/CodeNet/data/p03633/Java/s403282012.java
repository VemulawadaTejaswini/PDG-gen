import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Long[] T = new Long[N];

        for(int i=0; i<N; i++){
            T[i] = sc.nextLong();
        }
        long multiple = T[0];

        for(int i=1; i<N; i++){
            long lcm = divisor(multiple, T[i]);
            multiple = T[i] / lcm * multiple;
        }
        System.out.println(multiple);
    }

    private static long divisor(long x, long y){
        long max = Math.max(x, y);
        long min = Math.min(x, y);

        long amari = max % min;
        if(amari==0){
            return min;
        }

        min = divisor(min, amari);

        return min;
    }
}