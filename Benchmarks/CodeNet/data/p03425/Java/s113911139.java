import java.io.*;
import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    int M = 0;
    int A = 0;
    int R = 0;
    int C = 0;
    int H = 0;
    for(int i = 0; i < n; i++) {
      String curr = sc.nextLine();
      char ini = curr.charAt(0);
      if(ini == 'M') M++;
      else if(ini == 'A') A++;
      else if(ini == 'R') R++;
      else if(ini == 'C') C++;
      else if(ini == 'H') H++;
    }
    long MAR = M*A*R;
    long MAC = M*A*C;
    long MAH = M*A*H;
    long MRC = M*R*C;
    long MRH = M*R*H;
    long MCH = M*C*H;
    long ARC = A*R*C;
    long ARH = A*R*H;
    long ACH = A*C*H;
    long RCH = R*C*H;
    long sum = MAR+MAC+MAH+MRC+MRH+MCH+ARC+ARH+ACH+RCH;
    System.out.println(sum);
  }
}
 