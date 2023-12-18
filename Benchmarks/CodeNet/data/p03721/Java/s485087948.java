import java.util.*;

public class Main{    
    
      static final int AMAX = 100000;    
    
      static int cnt[] = new int[AMAX+1];
      
      public static void main(String[] args) {          
          
           Scanner sc = new Scanner(System.in);
       
           int N = sc.nextInt();
           
           int K = sc.nextInt();
           
       for(int i = 0;i < N;i++){
           int A = sc.nextInt();
           int B = sc.nextInt();
            cnt[A] += B;           
       }
           
       for(int ans = 1;ans <= AMAX;ans++){
           if(K <= cnt[ans]){
               System.out.println(ans);
               return;
           }         
           K -= cnt[ans];
       }           
           
    
  }   
}       
