import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        long N = scanner.nextLong();
        long Sum = 1;
        int hantei = 1;
        
        for(long i=0; i<N; i++){
            
            long A = scanner.nextLong();
            
            if(A==0){
                hantei = 0;
            }
            
            Sum = Sum*A;
            
            if(Sum>(long)Math.pow(10,18)){
                hantei = 2;
            }
            
        }
        
        if(hantei==0){
            System.out.println(0);
        }else if(Sum>(long)Math.pow(10,18)){
            System.out.println(-1);
        }else{
            System.out.println(Sum);
        }
        
    }
}
