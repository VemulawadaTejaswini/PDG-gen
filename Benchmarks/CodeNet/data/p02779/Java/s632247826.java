import java.util.*;

public class Main {
 
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    List<Integer> list = new ArrayList<Integer>();
    while(sc.hasNext()) {
      list.add(sc.nextInt());
    }
    
    boolean exists = false;
    for (int i = list.size() - 1; i > 0; i--) {
      int a = list.remove(i);
      if (list.indexOf(a) >= 0) {
        exists = true;
        break;
      } else {
        continue;
      }
    }
    
    if (exists) {System.out.println("Yes");} else {System.out.println("No");}
    
  }
  
}