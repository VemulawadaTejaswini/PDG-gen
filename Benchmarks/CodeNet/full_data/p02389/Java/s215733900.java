public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    string aa = scan.next();
    int a = Integer.parseInt(aa);
    string bb = scan.next();
    int b = Integer.parseInt(bb);
    int pie = a * b;
    int syuu = (2 * a) + (2 * b);
    System.out.println(pie + " " + syuu);
  }
}