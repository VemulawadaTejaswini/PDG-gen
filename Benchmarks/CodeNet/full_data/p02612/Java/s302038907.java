import java.util.*;

public class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt(),s=1000;
    while(N>s) {
      s += 1000;
    }
    
    System.out.println(s-N);
  }
}