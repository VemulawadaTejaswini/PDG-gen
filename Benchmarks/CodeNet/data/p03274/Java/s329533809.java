import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N,K;
    N = sc.nextInt();
    K = sc.nextInt();
    int ans = 1000000007;
    int tmp;
    Integer x[] = new Integer[N];
    for(int i=0; i<N; i++) x[i] = sc.nextInt();
    for(int i=0; i<N-K+1; i++){
      if((x[i] <= 0 && x[i+K-1] > 0) || (x[i] >= 0 && x[i+K-1] < 0)){
        int a = Math.abs(x[i]);
        int b = Math.abs(x[i+K-1]);
        tmp = Math.max(a,b) + Math.min(a,b) * 2;
      }else{
        if(x[i] <= 0) tmp = Math.abs(x[i]);
        else tmp = x[i+K-1];
      }
      ans = Math.min(ans, tmp);
    }
    System.out.println(ans);
  }
  
  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}