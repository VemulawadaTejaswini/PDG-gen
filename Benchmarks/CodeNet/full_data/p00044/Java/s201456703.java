import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      int n = sc.nextInt();
      boolean[] isPrime = new boolean[n+1];
      for (int i = 2; i <= n; i++) {
        isPrime[i] = true;
      }
      for (int i = 2; i*i <= n; i++) {
        if(isPrime[i]) {
          for (int j = 2*i; j <= n; j += i) {
            isPrime[j] = false;
          }
        }
      }
      int primeMax = 0;
      for (int i = n-1; ; i--) {
        if(isPrime[i]) {
          primeMax = i;
          break;
        }
      }
      int primeMin = n+1;
      searchMin:
      while(true) {
        for (int i = 2; i <= n; i++) {
          if (isPrime[i] && primeMin%i == 0) {
            primeMin++;
            continue searchMin;
          }
        }
        break;
      }
      System.out.println(primeMax+" "+primeMin);
    }
  }
}