import java.util.*;

public class Main{            
    
     public static void main(String[] args){
      
         Scanner sc = new Scanner(System.in);
         
         int N = sc.nextInt();
         int M = sc.nextInt();        
         
         ArrayList<Integer> first  = new ArrayList<Integer>();
         ArrayList<Integer> second = new ArrayList<Integer>();
         
         
         for(int i = 0;i < M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a == 1){
                first.add(b);
            }      
            
            if(b == N){
                second.add(a);
            }            
            
         }
         
         for(int i = 0;i < first.size();i++){
             int c = first.get(i);
             
             for(int j = 0;j < second.size();j++){
                int d = second.get(j);
                
                if(c == d){
                    System.out.println("POSSIBLE");
                    return;
                }
                
             }                          
         }
         
         System.out.println("IMPOSSIBLE");
         
     }              
}       

