import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    Set<String> dic = new HashSet<>();
    for(int i = 0; i < n; i++) {
      String[] s = sc.nextLine().split(" ");
      if(s[0].equals("insert")) {
        dic.add(s[1]);
      } else {
        if(dic.contains(s[1])) {
          System.out.println("yes");
        } else {
          System.out.println("no");
        }
      }
    }
  }
}

