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
        x = n;
    }
    long y = Math.min(n-b,a-1) + 1 + (Math.abs(b-a-1)/2);
    System.out.println(Math.min(x,y));
  }
}
