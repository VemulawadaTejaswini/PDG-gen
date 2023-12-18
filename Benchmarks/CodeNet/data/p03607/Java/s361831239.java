import java.util.*;

public class Main {
  public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     Set<String> box = new HashSet<String>() {};
     for (int i = 0 ; i < n; i ++) {
        String a = sc.next();
        if(box.contains(a)) {
           box.remove(a);
        } else {
           box.add(a);
        }
     }
     System.out.println(box.size());
  }
}