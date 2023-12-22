import java.util.*;

public class Main {
  public static boolean isNum(String s) {
    try {
      int n = Integer.parseInt(s);
      return true;
    } catch(NumberFormatException e) {
      return false;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Long> stack = new ArrayList<>();
    while(sc.hasNext()) {
      String s = sc.next();
      if(isNum(s)) {
        stack.add(Long.parseLong(s));
      } else {
        if(s.equals("+")) {
          long a = stack.get(stack.size() - 2) + stack.get(stack.size() - 1);
          stack.remove(stack.size() - 1);
          stack.set(stack.size() - 1, a);
        } else if(s.equals("-")) {
          long a = stack.get(stack.size() - 2) - stack.get(stack.size() - 1);
          stack.remove(stack.size() - 1);
          stack.set(stack.size() - 1, a);
        } else {
          long a = stack.get(stack.size() - 1) * stack.get(stack.size() - 2);
          stack.remove(stack.size() - 1);
          stack.set(stack.size() - 1, a);
        }
      }
    }
    System.out.println(stack.get(0));
  }
}

