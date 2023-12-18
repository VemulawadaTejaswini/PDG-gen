public class Main {
  public static void main(String[] args) {
    boolean flag;
    try {
      flag = (Integer.parseInt(args[0]) % 2 == 0) || (Integer.parseInt(args[1]) % 2 == 0);
    } catch (NumberFormatException e) {
      flag = false;
    }
    String out = flag ? "Even" : "Odd";
    System.out.print(out);
  }
}
