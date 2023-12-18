import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        long X = sc.nextLong();
        sc.close();

        System.out.println(ans(N, X));
    }
    static long ans(int N, long X){
        if(X == 1){
            return 0;
        } else {
            if(1 <= X && X <= 1+sum(N-1))
                return ans(N-1, X-1);
            else if(X == 2+sum(N-1))
                return pan(N-1)+1;
            else if(2+sum(N-1)<X && X <= 2+2*sum(N-1))
                return pan(N-1)+1+ans(N-1, X-2-sum(N-1));
            else
                return 2*pan(N-1)+1;
        }
    }

    static long sum(long N){
        if(N == 0){
            return 1;
        } else {
            return 2*sum(N-1)+3;
        }
    }

    static long pan(long N){
        if(N == 0){
            return 1;
        } else {
            return 2*pan(N-1)+1;
        }
    }
}