import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N,X;
    N = sc.nextInt();
    X = sc.nextInt();
    Integer x[] = new Integer[N];
    for(int i=0; i<N; i++) x[i] = sc.nextInt();
    int ans = Math.abs(X - x[0]);
    int tmp;
    for(int i=1; i<N; i++){
      tmp = Math.abs(X - x[i]);
      ans = gcd(ans, tmp);
    }
    System.out.println(ans);
  }
  
  public static int gcd(int a, int b){
    if(a < b){
      int c = a;
      a = b;
      b = c;
    }
    if(a%b == 0) return b;
    return gcd(b, a%b);
  }
}

