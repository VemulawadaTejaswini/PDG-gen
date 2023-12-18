import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextLong();
        long B = sc.nextLong();
        sc.close();

        long g = A;
        long count = 1;
        long limit = +1;
        for(int i = 2; i*i <= g; i++){
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