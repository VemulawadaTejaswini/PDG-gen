import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
	long sum = 0;
    
    for (long m=2; m<=Math.sqrt(n)+1; m++) {
      if (n%m == 0 && n%(m-1) != 0) {
        sum += m-1;
      }
    }
    
    System.out.println(sum);
  }
}
