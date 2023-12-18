import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();
      Stack<Character> stack = new Stack<>();
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i < s.length(); i++) {
        if(s.charAt(i) == '(')
          stack.push('(');
        else {
          if(!stack.isEmpty()) {
            stack.pop();
            sb.append('(');
            sb.append(')');
          } else {
              sb.append(')');
              sb.insert(0, '(');
          }
        }
      }
      for(int i = 0; i < stack.size(); i++)
        sb.append('(');
      for(int i = 0; i < stack.size(); i++)
        sb.append(')');
      System.out.println(sb.toString());
  }
}