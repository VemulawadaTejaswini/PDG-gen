import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long[] g = new long[n];
    for (int i=0;i<n;i++){
      g[i] = scan.nextLong()-i;
    }

    Arrays.sort(g);
    int t = 0;
    if (n%2 == 1){
      t = (int) (n-1)/2;
    }
    else{
      t = (int) n/2;
    }
    long base = g[t];
    long sum = 0;
    for (int i=0;i<n;i++){
      sum += find(base,g[i]);
    }

    System.out.println(sum);
  }

  static long find(long a, long b){
    if (b-a>= 0){
      return b-a;
    }
    else{
      return a-b;
    }
  }

}
