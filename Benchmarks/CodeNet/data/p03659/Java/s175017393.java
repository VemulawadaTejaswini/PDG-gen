import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[] num = new int[N];
    int sum = 0;
    String[] S = sc.nextLine().split(" ");
    
    for(int i = 0; i < N; i++){
      num[i] = Integer.parseInt(S[i]);
      sum += num[i];
    }
    
    int a = 0;
    int b = sum;
    int ans = 2147483647;
    for(int i = 0; i < N-1; i++){
      a += num[i];
      b -= num[i];
      int c = Math.abs(a - b);
      if(c < ans){
        ans = c;
      }
    }
    System.out.println(ans);
  }
}