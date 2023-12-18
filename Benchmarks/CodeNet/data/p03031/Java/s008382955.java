import java.util.*;
import static java.lang.System.*;

class Guidebook implements Comparable<Guidebook>{
  public String city;
  public int score;
  public int number;
  
  public int compareTo(Guidebook obj){
    if(this.city.equals(obj.city)){
      return obj.score - this.score;
    }else{
      return this.city.compareTo(obj.city);
    }
  }
}

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int s[] = new int[N];
    for(int i=0; i<M; i++){
      int k = sc.nextInt();
      for(int j=0; j<k; j++){
        int a = sc.nextInt();
        s[a-1] |= 1 << i;
      }
    }
    int p = 0;
    for(int i=0; i<M; i++){
      int x = sc.nextInt();
      p |= x << i;
    }
    int ans = 0;
    for(int i=0; i<(1<<N); i++){
      int t = 0;
      for(int j=0; j<N; j++){
        if((i>>j & 1) == 1) t ^= s[j];
      }
      if(t == p) ans++;
    }
    out.println(ans);
      
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}

