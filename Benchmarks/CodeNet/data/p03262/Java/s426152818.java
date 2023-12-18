import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int X = Integer.parseInt(S[1]);
    String[] T = sc.nextLine().split(" ");
    int[] dis = new int[N];
    int ans = 1000000000;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(T[i]);
      dis[i] = n;
      ans = Math.abs(n-X) < ans ? Math.abs(n-X) : ans;
    }
    
    for(int i = 0; i < N; i++){
      int n = Math.abs(dis[i]-X);
      if(n % ans != 0){
        ans = 1;
      }
    }
    System.out.println(ans);
  }
}