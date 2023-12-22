import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        
        long i = 0;
        long sum = 0; 
        do{
            i++;
            sum += i;
        } while (!(sum % N == 0)); 
        
        System.out.println(i);
        
    }    
}