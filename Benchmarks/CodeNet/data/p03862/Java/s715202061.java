import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int x = Integer.parseInt(S[1]);
    int[] candies = new int[N];
    
   for(int i = 0; i < N; i++){
     candies[i] = sc.nextInt();
   }
    
    int ans = 0;
    for(int i = 0; i < N-1; i++){
      int sum = candies[i] + candies[i+1];
      if(sum <= x){
        continue;
      }else{
        ans += sum-x;
        if(candies[i] <= x){
          candies[i+1] -= sum-x;
        }else{
          candies[i] = sum-x-candies[i+1];
          candies[i+1] = 0;
        }
      }
    }
    System.out.println(ans);
  }
}