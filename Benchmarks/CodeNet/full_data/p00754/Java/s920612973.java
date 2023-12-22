import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter("\\n");

    while(true) {
      String input = sc.next();
      if(input.equals(".")) {
        break;
      }

      char[] stack = new char[100];
      int position = 0;
      for(int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        if(c == '(') {
          stack[position] = '(';
          position++;
        }
        if(c == '[') {
          stack[position] = '[';
          position++;
        }
        if(c == ')') {
          if(position > 0 && stack[position - 1] == '(') {
            position--;
          } else {
            position = -1;
            break;
          }
        }
        if(c == ']') {
          if(position > 0 && stack[position - 1] == '[') {
            position--;
          } else {
            position = -1;
            break;
          }
        }
      }

      if(position == 0) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    }
  }
}