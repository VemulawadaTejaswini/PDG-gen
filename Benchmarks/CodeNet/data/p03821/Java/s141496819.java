import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[][] num = new int[N][2];
    for(int i = 0; i < N; i++){
      num[i][0] = Integer.parseInt(sc.next());
      num[i][1] = Integer.parseInt(sc.next());
    }
    
    int ans = 0;
    for(int i = N-1; i >= 0; i--){
      num[i][0] += ans;
      if(num[i][0] % num[i][1] != 0){
        int a = num[i][1] * (num[i][0]/num[i][1]+1) -num[i][0];
        num[i][0] += a;
        ans += a;
      }else{
        break;
      }
    }
    System.out.println(ans);
  }
}