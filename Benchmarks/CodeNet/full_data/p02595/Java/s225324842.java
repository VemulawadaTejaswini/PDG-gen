import java.util.*;

class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long d = sc.nextInt();
    long[] x = new long[n];
    long[] y = new long[n];
    int cnt = 0;
    d *= d;
    
    for (int i=0; i<n; i++) {
      x[i] = sc.nextLong();
      x[i] *= x[i];
      y[i] = sc.nextLong();
      y[i] *= y[i];
      if (x[i]+y[i] <= d)
        cnt++;
    }
    
    System.out.println(cnt);
  }
}