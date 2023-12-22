import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    boolean primes[] = new boolean [50000];
    for(int n = 2; n < primes.length; n++){
      if (primes[n]) continue;
      for (int m = 2 * n; m < primes.length; m += n) {
        primes[m] = true;
      }
    }
               
    while (in.hasNext()) {
      int num = in.nextInt();
      int pre =  num - 1;
      int post = num + 1;
      for (int i = pre;  primes[i]; i--) pre  = i - 1;
      for (int i = post; primes[i]; i++) post = i + 1;
      System.out.println(pre + " " + post);
    }
  }
}