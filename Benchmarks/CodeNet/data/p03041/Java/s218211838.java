import java.util.*;

public class Main { 
	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
		int length = Integer.parseInt(sc.next());
        int target = Integer.parseInt(sc.next())-1;
      
      	List<String> list = new ArrayList<>();
		String s = sc.next();
      for (int x = 1; x <= length; x++) {
		list.add(s.substring(x-1,x));
      }

      String a = list.get(target);
      if(a.equals("A")) {
		list.set(target, "a");
      }else if(a.equals("B")) {
        list.set(target, "b");
      } else {
        list.set(target, "c");
      }
      
      String res = null;
      StringBuilder sb = new StringBuilder();
      for (String x:list) {
        sb.append(x);
      }
      System.out.println(sb.toString());
    }
}
      	