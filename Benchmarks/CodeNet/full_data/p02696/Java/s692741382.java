import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        long B = Long.parseLong(sc.next());
        long N = Long.parseLong(sc.next());
        long amari = N % B;
        if(N < B) {
            System.out.println(floor(A*N/B) - (A * floor(N/B)));
        }else {
            if(floor(A/B) - A * floor(1/B) >= floor(A) - A * floor(1)) {
                System.out.println(floor((A * (B-1))/B) - A * floor((B-1)/B));
            }else if(floor(A/B) - A * floor(1/B) < floor(A) - A * floor(1)) {
                if(floor((A * (N - amari - 1))/B) - A * floor((N - amari - 1)/B) < floor((A * N) / B) - A * floor(N/B)) {
                    System.out.println(floor((A * N) / B) - A * floor(N/B));
                }else {
                    System.out.println(floor((A * (N - amari - 1))/B) - A * floor((N - amari - 1)/B));
                }
            }
        }
        
    }
    
    public static long floor(double t) {
        return (long)t;
    }
    
    public static long floor(long t) {
        return (long)t;
    }
}