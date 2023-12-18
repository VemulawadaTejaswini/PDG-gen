import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    char[] ch = new char[input.length()];
    for(int i = 0; i < input.length(); i++) ch[i] = input.charAt(i);
    boolean flag = true;
    for(int i = 0; i < input.length(); i++) {
      if(i % 2 == 0 && ch[i] == 'L') flag = false;
      if(i % 2 == 1 && ch[i] == 'R') flag = false;
    }
    if(flag) System.out.println("Yes");
    else System.out.println("No");
  }
}
