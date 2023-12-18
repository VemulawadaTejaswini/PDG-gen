import java.util.*;
 
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    int count = 0;
    char[] x = new char[N.length()];

    for(int i = 0 ; i < N.length() ; i ++){
      x[i] = N.charAt(i);
      count = (x[i] == 'p') ? count + 1 : count + 0;
    }
    System.out.println(N.length()/2 - count);
  }
}
