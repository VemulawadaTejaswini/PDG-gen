import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Set<String> s = new HashSet<String>();
    for(int i=0;i<n;i++){
      String d = sc.next();
      s.add(d);
    }
    System.out.println(s.size());
  }
}