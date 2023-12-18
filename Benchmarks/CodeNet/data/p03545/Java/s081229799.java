import java.util.*;
import java.io.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int A = n/1000;
    int B = n/100 - A*10;
    int C = n/10 - A*100 - B*10;
    int D = n%10;
    String[] ops = new String[2];
    ops[0] = "+";
    ops[1] = "-";
    boolean cont = true;
    outerloop:
    for(int i = 0; i < 2; i++) {
      for(int j = 0; j < 2; j++) {
        for(int k = 0; k < 2; k++) {
          int sum = 0;
          if(ops[i].equals("+"))
            sum += A+B;
          else
            sum += A-B;
          if(ops[j].equals("+"))
            sum += C;
          else
            sum -= C;
          if(ops[k].equals("+"))
            sum += D;
          else
            sum -= D;

          if(sum == 7) {
            System.out.println(A+ops[i]+B+ops[j]+C+ops[k]+D+"=7");
            break outerloop;
          }
        }
      }
    }
  }
}
