public class Main {
  public static void main(String[] args) {
    int x = Integer.parseInt(args[0]);
    int pow = 1;
    for (int i = 0;i < 3 ;i++) {
      pow *= x;
    }
    System.out.println(pow);
  }
}