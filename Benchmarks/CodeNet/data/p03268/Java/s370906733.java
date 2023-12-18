import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N =  sc.nextInt();
    int K =  sc.nextInt();
    long ans = 0;
    for(int i=1;i<=N;i++){
      int ak = i%K;
      int tmp = K-ak;
      int cnt = (N-tmp)/K;
      cnt++;
      if ((tmp+tmp)%K == 0){
       ans += cnt*cnt;
      }
    }
    System.out.println(ans);
    
  }
}