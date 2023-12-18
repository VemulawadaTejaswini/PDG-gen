import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = 0;
    long b = 0;
    long min = n;

    for(int i=1 ; i<=Math.sqrt(n) ; i++){
      if(n%i==0){
        a = i-1;
        b = n/i-1;
      }
      min = Math.min(min,a+b);
    }
    System.out.println(min);
  }
}
