import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long M = sc.nextLong();
    if(Math.abs(N-M)>=2){
      System.out.println(0);
    }else{
      System.out.println((kaijo(N)*kaijo(M))%(1000000000+7));
    }
  }
  public static long kaijo(long n){
    if(n==1){
      return 1;
    }else{
      return n*kaijo(n-1);
    }
  }
}
