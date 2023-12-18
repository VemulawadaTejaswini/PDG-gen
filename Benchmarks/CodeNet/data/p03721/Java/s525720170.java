import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int K = Integer.parseInt(S[1]);
    int[] num = new int[100000];
    
    for(int i = 0; i < N; i++){
      String[] T = sc.nextLine().split(" ");
      int A = Integer.parseInt(T[0])-1;
      int B = Integer.parseInt(T[1]);
      num[A] += B;
    }
    
    int n = 0;
    int ans = 0;
    for(int i = 0; i < 100000; i++){
      n += num[i];
      if(n >= K){
        ans = i + 1;
        break;
      }
    }
    System.out.println(ans);
  }
}
    