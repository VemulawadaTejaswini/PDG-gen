import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    long sum = 0;
    for (long i=1;i<=n;i++){
      sum += get(i,n);
    }
    System.out.println(sum);
  }

  public static long get(long a, long b){
    long g = (long) b/a;
    long c = (long) (g+1)*g*a/2;
    return c;
  }
}
