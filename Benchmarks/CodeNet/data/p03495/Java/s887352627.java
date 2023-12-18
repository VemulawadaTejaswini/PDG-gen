import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int K = Integer.parseInt(S[1]);
    int[] num = new int[N];
    Set<Integer> set = new HashSet<>();
    String[] T = sc.nextLine().split(" "); 
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(T[i]);
      num[n-1]++;
      set.add(n);
    }
    
    int M = set.size();
    if(M <= K){
      System.out.println(0);
      return;
    }else{
      M -= K;
    }
    
    int ans = 0;
    for(int i = 0; i < M; i++){
      int min = 1000000;
      int k = 0;
      for(int j = 0; j < N; j++){
        if(num[j] < min && num[j] > 0){
          k = j;
          min = num[j];
        }
      }
      ans += min;
      num[k] = 0;
    }
    System.out.println(ans);
  }
}