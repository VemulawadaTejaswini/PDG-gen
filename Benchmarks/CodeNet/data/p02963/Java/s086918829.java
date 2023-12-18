import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long N = scan.nextLong();
    System.out.print("0 0 ");
    long A = N%1000000000>0 ? N/1000000000+1:N/1000000000;
    long B = 1000000000*A-N;
    System.out.println("10000000000 "+B+" 1 "+A);
  }
}