import java.util.*;
public class Main{
  Scanner cin = new Scanner(System.in);
  int N,M,K;
  P[] ps;
  private class P implements Comparable<P>{
    int a,b;
    public P(int a,int b){
      this.a = a;
      this.b = b;
    }

    public int compareTo(P p){
      if(this.a > p.a)return -1;
      if(this.a < p.a)return 1;

      if(this.b > p.b)return -1;
      if(this.b < p.b)return 1;
      return 0;
    }
  }

  public void solve(){
    N = cin.nextInt();
    M = cin.nextInt();
    K = cin.nextInt();
    ps = new P[N];
    for(int i = 0;i < N;i++){
      ps[i] = new P(cin.nextInt(),0);
    }

    for(int i = 0;i < N;i++){
      ps[i].b = cin.nextInt();
    }
    Arrays.sort(ps);
    int ans = 0;

    for(int i = 0;i < 1 << N;i++){
      int cnt = 0;
      for(int j = 0;j < N;j++){
        if(((i >> j) & 1 )== 1){
          cnt++;
        }
      }

      if(cnt <= K){
        int remain = M;
        int sum = 0;
        for(int j = 0;j < N;j++){
          if(((i >> j) & 1) == 1){
            sum += ps[j].a * Math.min(remain,ps[j].b);
            remain = remain - Math.min(remain,ps[j].b);
          }
        }
        ans = Math.max(ans,remain + sum);
      }
    }

    System.out.println(ans);

  }
  public static void main(String[] args){
    new Main().solve();
  }
}