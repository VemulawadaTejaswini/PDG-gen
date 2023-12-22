import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    long[] a = new long[n];
    long mod = 1000000007;
    
    for(int i = 0; i<n; i++){
      a[i] = Long.parseLong(sc.next());
    }

    long sum = 0;

    for(int i=0; i<n-1; i++){
      for(int j=i+1; j<n; j++){
        sum += a[i] * a[j];
        sum = sum % mod;
      }
    }

   System.out.println(sum);
    sc.close();
    return;
  }
  
}
