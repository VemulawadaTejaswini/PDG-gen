import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextLong();
        long B = sc.nextLong();
        sc.close();

        if(B < A){
            long t = A;
            A = B;
            B = t;
        }

        long g = A;
        long count = 1;
        long limit = (long)(Math.sqrt(A));
        for(int i = 2; i <= limit+1; i++){
            if(A%i == 0){
                while(A%i == 0){
                    A /= i;
                }
                if(B%i == 0){
                    count++;
                }
            }
        }
        if(g != 1 && g == A){
            if(B%g == 0)
                count++;
        }
        System.out.println(count);
    }
}