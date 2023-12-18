import java.util.*;

public class Main{

     public static void main(String []args){
      int N, H;
      Scanner sc = new Scanner(System.in);
      N = sc.nextInt();
      H = sc.nextInt();
      int[] kthrow = new int[N];
      int[] attack = new int[N];
      int temp;
      int sum = 0;
      int count = 0;
      int num = 0;
      
      for(int i = 0; i<N; i++){
          attack[i] = sc.nextInt();
          kthrow[i] = sc.nextInt();
      }
      
      if(N == 1){
          H = H - kthrow[0];
          count++;
          if(H >0){
              if(H%attack[0] == 0)
              count += H/attack[0];
              else
              count += H/attack[0]+1;
          }
          System.out.println(count);
          return;
      }
      else{
      
        Arrays.sort(kthrow);
        Arrays.sort(attack);
       
          
          for(int i = 0; i<N; i++){
              if(attack[N-1] > kthrow[i])
                num++;
          }
    
          for(int i = N-1; i>=num; i--){
              sum = sum + kthrow[i];
              count++;
              if(H <= sum){
                  System.out.println(count);
                  return;
              }
          }
           
          H = H - sum;
          if((H % attack[N-1]) == 0)
            count += H/attack[N-1];
          else
            count += H/attack[N-1] + 1;
          
            System.out.println(count);
      }
     }
}