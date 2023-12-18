import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = primeArray();
    int[] fin = new int[N];
    for(int i = 0; i < N; i++) {
      fin[i] = arr[i];
    }
    String out = "";
    for(int curr : fin)
      out += curr + " ";
    System.out.println(out.substring(0, out.length()-1));
  }
  
  /*public static boolean checkIf5(int[] n) {
    int sum = 0;
    for(int curr : n) {
      sum += curr;
    }
    return sum % 5 == 0;
  }*/
  
  public static int[] primeArray() {
    int[] primes = new int[10000];
    primes[0] = 2;
    int ind = 1;
    for(int i = 3; i <= 55555; i += 2) {
      if(isPrime(i) && i % 10 == 7) {
        primes[ind] = i;
        ind++;
      }
    }
    return primes;
  }
  
  public static boolean isPrime(int n) {
    for(int i = 2; i < n; i++) {
      if(n % i == 0)
        return false;
    }
    return true;
  }
  
  public static int returnSum(int[] n) {
    int sum = 0;
    for(int i = 0; i < n.length; i++)
      sum += n[i];
    return sum;
  }
}
