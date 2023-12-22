import java.util.*;

public class Main {
    static long lcm(long a,long b){
        long x=Math.max(a,b),y=Math.min(a,b);
        while(x%y!=0){
            long t=x%y;
            x=y;y=t;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            long a=s.nextLong(),b=s.nextLong(),lcm=lcm(a,b);
            System.out.printf("%d %d\n",lcm,a*b/lcm);}

    }

}
