import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    int k = sc.nextInt();
    HashSet<String> set = new HashSet<String>();
    ArrayList<String> list = new ArrayList<String>();
    for(int i = 0; i < s.length(); i++) {
      for(int j = 1; j <= 5; j++) {
        if((i + j) <= n) set.add(s.substring(i, i + j));
      }
    }
    for(Iterator<String> itr = set.iterator(); itr.hasNext();) {
      list.add(itr.next());
    }
    Collections.sort(list);
    System.out.println(list.get(k - 1));
  }
}
