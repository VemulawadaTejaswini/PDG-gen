import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int ans = -1;
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] s = new int[N];
    int i,j,buf,dust;
    int flg = 0;
    for(i = 0;i < M;i++){
      buf = sc.nextInt();
      if(buf <= N){
        s[buf-1] = sc.nextInt();
        flg = 1;
      }else{
        dust = sc.nextInt();
      }
    }
      if(flg == 1){
        ans = 0;
        buf = 1;
        for(i = 0;i < N; i++){
          ans += s[i] * buf;
          buf *= 10;
        }
      }
      System.out.println(ans);
  }
}