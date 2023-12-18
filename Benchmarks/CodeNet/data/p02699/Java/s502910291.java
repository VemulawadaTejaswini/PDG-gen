import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Set<String> set = new HashSet<String>();
    int n = scan.nextInt();
    String[] s = new String[n];
    for(int i = 0; i < n; i++){
      s[i] = scan.next();
      set.add(s[i]);
    }
    System.out.println(set.size());
  }
}