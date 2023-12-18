import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int t [] = new int [N];
    
    for(int i=0; i<N; i++){
      t[i] = sc.nextInt();
    }
    
    int ans = 0;
    for(int i=0; i<N; i++){
      ans += Math.max(t[i],T); 
    }
   System.out.println(ans+T); 
  }
}