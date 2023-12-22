import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long A = in.nextLong();
        long B = in.nextLong();
        long N = in.nextLong();
        long max = f(1,A,B);
        for(long i = 2; i <= N; i++){
            long t = f(i,A,B);
            if(t>max){
                max = t;
            }
        }
        System.out.print(max);
    }
    public static long f(long x,long A, long B){
        return (long)(Math.floor((double)x*A/(double) B)-A*Math.floor((double)x/(double) B));
    }

}