import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long sum = 0;
    for(long i=1;i<=Math.sqrt(n);i++){
      if(n%i==0){
        long y = n/i;
        if(n/(y-1)==n%(y-1))sum+=y-1;
      }
    }
    System.out.println(sum);
  }
}