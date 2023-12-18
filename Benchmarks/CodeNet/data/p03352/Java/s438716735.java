import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int i = 1;
    
    while(X>i*i -1) {
      i++;
    }
    i--;
    System.out.println(i*i);
  }
}