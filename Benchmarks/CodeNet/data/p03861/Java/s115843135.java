import java.util.*;

public class Main {    
    public static void main(String[] args){        
        Scanner sc = new Scanner(System.in);                                
         
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        
        int count = 0;
        for(long i = a;i <= b;i++){
            if(i%x == 0){
                count++;
            }
        }
        
        System.out.println(count);
        
    }            
}
        
        
        
        
        