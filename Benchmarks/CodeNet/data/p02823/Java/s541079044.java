import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    long a = scan.nextLong();
    long b = scan.nextLong();

    if(a == b){
      System.out.println(0);
      return;
    }
    long x = (Math.abs(b-a))/2;
    if(x == 0){
        x = Long.MAX_VALUE;
    }
    long y = Math.max(a-1,b-1);
    long z = Math.max(n-a,n-b);
    System.out.println(Math.min(Math.min(x,y),z));
  }
}