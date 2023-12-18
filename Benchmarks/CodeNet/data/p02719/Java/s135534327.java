import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();
        Long K = sc.nextLong();
        boolean sw=true;
        if(K==1){
            System.out.println("0");
            return;
        }
        
        if(Math.abs(N-K)<N){
            sw=true;
        }
        while(sw){
            N=Math.abs(N-K);
            
            if(Math.abs(N-K)>N){
                sw=false;
            }
            
            
            
        }
        System.out.println(N);
    }
}
