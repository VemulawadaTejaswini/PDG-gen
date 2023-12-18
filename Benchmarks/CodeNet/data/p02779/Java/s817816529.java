import java.util.*;

public class Main {
 
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    List list = new ArrayList<String>();
    while(sc.hasNext()) {
      list.put(sc.nextInt());
    }
    
    for (int i = list.length() - 1; i < 0; i--) {
      int a = list.remove(i);
      if (list.indexOf(a) > 0) {
        System.out.println("NO");
        return;
      } else {
      }
    }
    
    System.out.println("YES");
    
  }
  
}