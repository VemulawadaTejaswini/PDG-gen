import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n=sc.nextLong(),k=sc.nextLong();
    System.out.println((int)Math.min(k-(n%k),n%k));
  }
}
