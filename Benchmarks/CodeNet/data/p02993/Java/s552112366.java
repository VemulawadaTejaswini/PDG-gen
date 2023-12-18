import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] c = new char[4];

    for(int i = 0;i < 4;i++) {
      c[i] = s.charAt(i);
    }

    if(c[0] == c[1] || c[1] == c[2] || c[2] == c[3]) {
      System.out.println("Bad");
    } else {
      System.out.println("Good");
    }

  }

}
