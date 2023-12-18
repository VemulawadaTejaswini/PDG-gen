import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int X = Integer.parseInt(S[1]);
    
    String[] T = sc.nextLine().split(" ");
    int[] num = new int[N];
    for(int i = 0; i < N; i++){
      num[i] = Integer.parseInt(T[i]);
    }

    int ans = 1000000000;
    for(int i = 0; i < N; i++){
      int n = Math.abs(X - num[i]);
      ans = n < ans ? n : ans;
    }
    
    System.out.println(ans);
  }
}