
import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) throws Exception {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    // Your code here!
    Scanner scan = new Scanner(is);
    long X = scan.nextLong();
    long K = scan.nextLong();
    long D = scan.nextLong();

    long ans = 0;
    long prevprev = 0;
    long prev = 0;
    long times = 0;
    if(X > 0){
      if(X/D < K) {
        K -= X/D;
        X = X - D * (X/D);
      } else {
        X = X - D*K;
        K = 0;
      }
    } else {
      if(-1*X/D < K) {
        K -= -1*X/D;
        X = X + D*(X/D);
      } else {
        X = X + D*K;
        K = 0;
      }
    }

    while(K > 0) {
      if(X > 0) {
        X -= D;
      } else {
        X += D;
      }
      K--;
      times++;
      if(times == 1)
        prevprev = X;
      else if(times == 2)
        prev = X;

      if(times >= 3) {
        if((X > 0 && prev <= 0 && prevprev >0) || (X <=0 && prev > 0 && prevprev <= 0)) {
          if(K % 2 == 1){
            if(X > 0) {
              X -= D;
            } else {
              X += D;
            }
          }
          break;
        }


        prevprev = prev;
        prev = X;
      }
    }

    os.println(Math.abs(X));
  }
}
