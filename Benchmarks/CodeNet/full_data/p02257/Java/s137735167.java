import java.util.Scanner;

class Main {  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int count = 0;

    while (N != 0) {
      int num = in.nextInt();
      if (isPrime(num)) count++;
      N--;
    }
    
    System.out.println(count);
  }
  
  public static boolean isPrime(int x) {
    if      (x == 2)     return true;
    else if (x % 2 == 0) return false;
    else {
      for (int i = 3; i < x; i += 2) {
        if (x % i == 0) return false;
      }
      return true;
    }
  }
}