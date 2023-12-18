import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    long[] arr = new long[N];
    long A = 0;
    long B = 1;
    for (int i=0;i<N;i++){
      long n = scan.nextLong();
      arr[i] = n;
      A+=n;
      B*=n;
    }
    long a = 0;
    for (int i=0;i<N;i++){
      a += B/arr[i];
    }
    double C = (double)B/(double)a;
    System.out.println(C);
  }
}