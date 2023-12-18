import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int M = Integer.parseInt(S[1]);
    
    int[] count = new int[M];
    for(int i = 0; i < N; i++){
      String[] T = sc.nextLine().split(" ");
      int K = Integer.parseInt(T[0]);
      for(int j = 1; j <= K; j++){
        int n = Integer.parseInt(T[j]);
        count[n-1]++;
      }
    }
    
    int ans = 0;
    for(int i = 0; i < M; i++){
      if(count[i] == N){
        ans++;
      }
    }
    System.out.println(ans);
  }
}