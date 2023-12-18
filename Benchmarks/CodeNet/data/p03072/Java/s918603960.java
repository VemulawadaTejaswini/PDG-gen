import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int first = sc.nextInt();
    int ans = 1;
    
    for(int i=0;i<N;i++){
      int a = sc.nextInt();
      if(a >= first){
        ans++;
      }
    }
    System.out.println(ans);
  }
}
