import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long M = sc.nextLong();
        sc.close();

        long count = 0;

        if(M == 1){
            count = 0;
        } else{
            if(N  >= M*2){
                count += M/2;
                N -= count;
                count += N/2;

            } else {
                count += N;
                M -= 2*N;
                count += M/4;
            }
        }

        System.out.println(count);
    }
}