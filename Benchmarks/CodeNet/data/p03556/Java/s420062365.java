import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int N;
    int i;
    N = s.nextInt();
    for(i = N; ((Math.sqrt(i) - (int)(Math.sqrt(i))) != 0.0); i--);
    System.out.printf("%d",i);
  }
}
