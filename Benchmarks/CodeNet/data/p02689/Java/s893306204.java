import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int M = Integer.parseInt(S[1]);
    
    S = sc.nextLine().split(" ");
    int[] alt = new int[N];
    for(int i = 0; i < N; i++){
      alt[i] = Integer.parseInt(S[i]);
    }
    
    boolean[] flag = new boolean[N];
    for(int i = 0; i < M; i++){
      S = sc.nextLine().split(" ");
      int A = Integer.parseInt(S[0])-1;
      int B = Integer.parseInt(S[1])-1;
      if(alt[A] <= alt[B]) flag[A] = true;
      if(alt[B] <= alt[A]) flag[B] = true;
    }
    int ans = 0;
    for(boolean b : flag){
      if(!b) ans++;
    }
    System.out.println(ans);
  }
}