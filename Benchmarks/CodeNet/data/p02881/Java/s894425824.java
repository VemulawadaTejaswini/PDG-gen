import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long l = 0;
    long r = 0;
    for(long i=1;i<=Math.sqrt(n);i++){
      if(n%i==0){
        l=i;
        r=n/i;
      }
    }
    System.out.println(l+r-2);
  }
}