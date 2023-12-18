import java.util.*;

public class Main {
  public static void main(String[] args) {
    int i, count = 1;
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    for(i = 1; i < 4; i++) {
      if(str.charAt(0) == str.charAt(i)) count++;
    }
    if(count == 2) System.out.println("Yes");
    else System.out.println("No");
  }
}
