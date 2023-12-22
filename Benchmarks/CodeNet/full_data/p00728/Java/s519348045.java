import java.util.*;

public class Main {                       
 
  public static void main(String[] args) {                     
      Scanner sc = new Scanner(System.in);
      
      ArrayList<Integer> ans = new ArrayList<Integer>();
      
      while(true){
           int N = sc.nextInt();
           
           if(N == 0){
               break;
           }
           
           int score[] = new int[N];
           
           for(int i = 0;i < N;i++){
               score[i] = sc.nextInt();
           }
           
           Arrays.sort(score);

           int sum = 0;
           for(int i = 1 ;i <= N - 2;i++){
               sum += score[i];               
           }                      
           
           int average = sum/(N-2);
           
           ans.add(average);
      }
      
      for(int i = 0;i < ans.size();i++){
          System.out.println(ans.get(i));
      }
    
  }  
      
}