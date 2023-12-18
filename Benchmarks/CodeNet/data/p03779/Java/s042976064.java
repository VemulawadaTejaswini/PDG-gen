import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    
    int i = 0;
    int x = 0;
    while (x < X) {
      i++;
      x += i;
    }
    
    System.out.println(i);
  }
}