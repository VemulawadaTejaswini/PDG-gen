import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();
        long N = 2;
        long T = 1;
        
        while(S >= 1000000000){
            if(S%N == 0){
                S = S/N;
                T = T*N;
                if(S%N != 0){
                    N++;
                }
            }
        }
        
        System.out.println(S + " 0 0 " + T + " 0 0");
    }
}