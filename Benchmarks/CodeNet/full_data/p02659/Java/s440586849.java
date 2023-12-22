import java.util.*;

public class Main {  
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    long a = in.nextLong();
    long b = (long)(in.nextDouble()*100);
    System.out.print((a*b)/100);
  }
}