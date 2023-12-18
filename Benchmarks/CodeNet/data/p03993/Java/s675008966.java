import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int[] num = new int[N];
    for(int i = 0; i < N; i++){
      num[i] = Integer.parseInt(sc.next());
    }
    
    int ans = 0;
    for(int i = 0; i < N; i++){
      if(i == num[num[i]-1]-1){
        ans++;
      }
    }
    System.out.println(ans/2);
  }
}