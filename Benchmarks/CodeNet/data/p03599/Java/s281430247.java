import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    int E = sc.nextInt();
    int F = sc.nextInt();
    int ans = 0;
    int sugar = 0;
    int con = -1;
    int tmpAns;   
    int tmpSugar;
    int tmpCon;
    for(int i=0; A*i*100<=F; i++){
      for(int j=0; A*i*100+B*j*100<=F; j++){
        if(i == 0 && j == 0) continue;
        int limit = (A*i + B*j) * E;
        for(int k=0; C*k<=limit; k++){
          for(int l=0; C*k+D*l<=limit; l++){
            tmpSugar = C*k+D*l;
            tmpAns = A*i*100 + B*j*100 + tmpSugar;
            if(tmpAns > F) continue;
            tmpCon = 100 * tmpSugar / tmpAns;
            if(tmpCon > con){
              ans = tmpAns;
              sugar = tmpSugar;
              con = tmpCon;
            }
          }
        }
      }
    }
    out.println(ans + " " + sugar);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}