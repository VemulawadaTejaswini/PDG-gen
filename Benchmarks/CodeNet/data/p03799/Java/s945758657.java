import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long M = sc.nextLong();
        sc.close();

        long count = 0;

        count += Math.min(N, M/2);
        N -= count;
        M -= 2*count;
        if(M > 0){
            count += M/4;
        }
        System.out.println(count);
    }
}