import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        long n = stdIn.nextLong();
        long min = n + 1;
        long index = n; 
        
        for(long i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(i + n / i < min){
                    min = i + n / i;
                }
            }
        }
        
        System.out.println(min - 2);
    }
}
