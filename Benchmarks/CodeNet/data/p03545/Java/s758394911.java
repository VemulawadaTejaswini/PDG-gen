import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = sc.nextInt();
    int A = N / 1000;
    int B = N % 1000 / 100;
    int C = N % 100 / 10;
    int D = N % 10;
    boolean check = true;
    for(int i=0; i<2; i++){
      if(check == false) break;
      for(int j=0; j<2; j++){
        if(check == false) break;
        for(int k=0; k<2; k++){
          int tmp;
          if(i == 0) tmp = A+B;
          else tmp = A-B;
          if(j == 0) tmp += C;
          else tmp -= C;
          if(k == 0) tmp += D;
          else tmp -= D;
          if(tmp == 7){
            String op1, op2, op3;
            if(i == 0) op1 = "+";
            else op1 = "-";
            if(j == 0) op2 = "+";
            else op2 = "-";
            if(k == 0) op3 = "+";
            else op3 = "-";
            out.println(A + op1 + B + op2 + C + op3 + D + "=7");
            check = false;
            break;
          }
        }
      }
    }
      
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}