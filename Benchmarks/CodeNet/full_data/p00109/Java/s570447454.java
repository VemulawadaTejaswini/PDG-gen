import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    String dummy = scanner.nextLine();
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      Deque<String> ou = new ArrayDeque<String>();
      Deque<String> op = new ArrayDeque<String>();
      for (int ii = 0; ii < line.length(); ii++) {
        Character pp = line.charAt(ii);
        String p = pp.toString();
        if (p.equals("=")) {
          while (!op.isEmpty()) {
            ou.addLast(op.removeLast());
          }
          break;
        } else if (p.equals("+") || p.equals("-")) {
          while (!op.isEmpty()) {
            if (op.getLast().equals("(")) {
              break;
            }
            ou.addLast(op.removeLast());
          }
          op.addLast(p);
        } else if (p.equals("*") || p.equals("/") || p.equals("(")) {
          op.addLast(p);
        } else if (p.equals(")")) {
          for (;;) {
            if (op.isEmpty()) {
              break;
            }
            String work = op.removeLast();
            if (work.equals("(")) {
              break;
            }
            ou.addLast(work);
          }
        } else {
          ou.addLast(p);
        }
//System.out.println(ou.toString());
//System.out.println(op.toString());
      }
//System.out.println(ou.toString());
//System.out.println(op.toString());
      Deque<Integer> num = new ArrayDeque<Integer>();
      while (!ou.isEmpty()) {
        String p = ou.removeFirst();
        if (p.equals("+")) {
          num.addLast(num.removeLast() + num.removeLast());
        } else if (p.equals("-")) {
          int a = num.removeLast();
          int b = num.removeLast();
          num.addLast(b - a);
        } else if (p.equals("*")) {
          num.addLast(num.removeLast() * num.removeLast());
        } else if (p.equals("/")) {
          int a = num.removeLast();
          int b = num.removeLast();
          num.addLast(b / a);
        } else {
          num.addLast(Integer.parseInt(p));
        }
      }
      out += num.removeLast() + "\n";
    }
    System.out.print(out);
  }
}