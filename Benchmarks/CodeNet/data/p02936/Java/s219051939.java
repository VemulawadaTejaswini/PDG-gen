import java.util.*;

public class Main{
  static int[] ans;
  static Map<Integer, Integer> map;
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int Q = Integer.parseInt(S[1]);
    
    int[] par = new int[N+1];
    int[] ans = new int[N+1];
    
    for(int i = 0; i < N-1; i++){
      String[] T = sc.nextLine().split(" ");
      int A = Integer.parseInt(T[0]);
      int B = Integer.parseInt(T[1]);
      
      par[B] = A;
    }
    
    for(int i = 0; i < Q; i++){
      String[] T = sc.nextLine().split(" ");
      int X = Integer.parseInt(T[0]);
      int Y = Integer.parseInt(T[1]);
      ans[X] += Y;
    }
    
    for(int i = 1; i <= N; i++){
      ans[i] += ans[par[i]];
      if(i == N){
        System.out.println(ans[i]);
      }else{
        System.out.print(ans[i] + " ");
      }
    }
  }
}