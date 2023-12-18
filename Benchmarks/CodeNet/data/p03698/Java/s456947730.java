import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String x = sc.next();
    char[] c = new char[x.length()];
    Boolean bool = true;
    Set<String> linkedHashSet = new LinkedHashSet<String>();
    
    for(int i=0; i<x.length(); i++) {
      c[i] = x.charAt(i);
      linkedHashSet.add("'" + c[i] + "'");
    }
    
    if(x.length() ==linkedHashSet.size()) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}