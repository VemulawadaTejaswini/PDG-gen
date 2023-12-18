import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int K = Integer.parseInt(S[1]);
    int[] num = new int[100001];
    
    for(int i = 0; i < N; i++){
      String[] T = sc.nextLine().split(" ");
      int A = Integer.parseInt(T[0]);
      int B = Integer.parseInt(T[1]);
      num[A] += B;
    }
    
    int n = 0;
    int ans = 0;
    for(int i = 1; i < 100001; i++){
      n += num[i];
      if(n >= K){
        ans = i;
        break;
      }
    }
    System.out.println(ans);
  }
}