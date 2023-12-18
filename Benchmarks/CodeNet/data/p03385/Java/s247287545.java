import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    
    System.out.println(s.replaceAll("[^a]", "").length() > 0 && s.replaceAll("[^b]", "").length() > 0 && s.replaceAll("[^c]", "").length() > 0);
  }
}