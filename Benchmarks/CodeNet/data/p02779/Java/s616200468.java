import java.util.*;
 
public class Main {
 
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int length = sc.nextInt();
    
    boolean distinct = true;
    List<Integer> list = new ArrayList<Integer>();
    while(sc.hasNext()) {
      int a = sc.nextInt();
      if (list.indexOf(a) == -1) {
      	list.add(a);
      } else {
        distinct = false;
        break;
      }
    }
      
      if(distinct) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    
  }
  }