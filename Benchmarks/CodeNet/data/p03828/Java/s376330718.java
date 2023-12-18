import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();

    sc.close();

    int[] primeNumber  = new int[1001];

    long mod = 1000000000 + 7;

    for (int i = 2; i <= N; i++) {
      
      int j = i;

      while (j > 1) {
        for (int k = 2; k <= j; k++) {
          if (j % k == 0) {
            primeNumber[k]++;
            j = j / k;
            break;
          }
        }
      }

    }

    long ans = 1;

    for (int i = 2; i <primeNumber.length; i++) {
      ans =  ans * (primeNumber[i]+1) % mod;
    }

    System.out.println(ans);

  }

}