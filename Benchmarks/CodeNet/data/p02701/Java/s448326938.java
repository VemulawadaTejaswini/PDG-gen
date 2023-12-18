import java.util.*;
public class Main {
  public static void main(String[] args){
    Set<String> ans = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for (int i=0; i<num; i++) {
      ans.add(sc.next());
    }
    System.out.println(ans.size());
  }
}