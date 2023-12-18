import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Set<String> said = new HashSet<>();
    String w0 = sc.next();
    char nextHead = w0.charAt(w0.length()-1);
    said.add(w0);
    for (int i = 0; i < N-1; i++) {
      String w = sc.next();
      if (w.charAt(0) != nextHead || !said.add(w)) {
        System.out.println("No");
        return;
      }
      nextHead = w.charAt(w.length()-1);
    }
    System.out.println("Yes");
  }
}