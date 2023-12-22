import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    long g =n%1000;
    if (g == 0){
      g = 1000;
    }
    System.out.println(1000-g);
  }
}
