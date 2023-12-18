import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int[] t = new int[N];
    int ans = 0;
    
    for(int i=0; i<N; i++){
        t[i] = sc.nextInt();
      if(i > 0){
        if(t[i]-t[i-1] >= T){
          ans += T;
        }else if(t[i]-t[i-1] < T){
          ans += t[i]-t[i-1];
        }
      }
    }
    System.out.println(ans+T);
  }
}