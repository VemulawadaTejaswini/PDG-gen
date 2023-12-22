import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = 104729;
    int counter = 0;
    boolean[] isprime = new boolean[n+1];
    for (int i = 2; i <= n; i++) {
      isprime[i] = true;
    }
    for (int i = 2; i*i <= n; i++) {
      if(isprime[i]) {
        for (int j = 2*i; j <= n; j += i) {
          isprime[j] = false;
        }
      }
    }
    while(true) {
      n = sc.nextInt();
      if(n == 0) {
        break;
      }
      int sum = 0;
      int j = 0;
      for (int i = 0; i < n;) {
        if(isprime[j]) {
          sum += j;
          i++;
        }
        j++;
      }
      System.out.println(sum);
    }
  }
}