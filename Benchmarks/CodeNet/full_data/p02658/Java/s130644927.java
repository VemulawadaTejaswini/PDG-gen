import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        long N = scanner.nextLong();
        double Sum = 1;
        
        for(long i=0; i<N; i++){
            long A = scanner.nextLong();
            Sum *= A;
        }
        
        double S = Math.pow(10,18);
        
        if(Sum<=S){
            System.out.println((long)Sum);
        }else{
            System.out.println(-1);
        }

    }
}
