import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long gcd = gcd(A,B);

    Set<Long> set = new HashSet<>();
    for (long i = 2; i <= gcd ; i++) {
      if(gcd%i ==0){
        set.add(i);
        while(gcd%i == 0)
          gcd =gcd/i;
      }
    }

    System.out.println(set.size()+1);

  }
static
  long gcd(long a, long b){
    if(b==0) return a;
    return gcd(b,a%b);
  }



}