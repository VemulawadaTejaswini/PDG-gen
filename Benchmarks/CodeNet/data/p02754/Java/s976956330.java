import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    long a = sc.nextInt();
    long b = sc.nextInt();


    long p = n/(a+b);
    long q = n%(a+b);

    if(q>a){
      q = a;
    }

    long ans = a * p + q;

    System.out.println(ans);
  }
}
