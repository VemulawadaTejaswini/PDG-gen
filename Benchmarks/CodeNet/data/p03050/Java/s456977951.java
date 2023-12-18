import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = Integer.parseInt(sc.next());
	long sum = 0;
    
    for (long m=2; m<=n; m++) {
      if (n%m == 0 && n%(m-1) != 0 && n%(m-1) < m) {
        sum += m-1;
      }
    }
    
    System.out.println(sum);
  }
}
