import java.util.*;

public class Main {           
    
    public static void main(String[] args) {		        
        Scanner sc = new Scanner(System.in);                               
        
        int N = sc.nextInt();        
        
        int max = Integer.MIN_VALUE;
        
        int ans = -1;
        for(int i= 1;i <= N;i++){            
            if(two(i) > max){
               ans = i;
            }            
            max = Math.max(max,two(i));            
        }            
        
        System.out.println(ans);
        
    }       
    
    private static int two(int N){
        
        int count = 0;
        
        while(true){
           if(N%2 == 0){
               count++;
               N = N/2;
           }else{
               break;
           }            
        }
        
        return count;
        
    }
    
}
