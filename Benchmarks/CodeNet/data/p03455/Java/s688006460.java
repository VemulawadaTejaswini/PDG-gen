import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    boolean flag = Arrays.stream(args).anyMatch(i -> Integer.parseInt(i) % 2 == 0);
    String out = flag ? "Even" : "Odd";
    System.out.print(out);
  }
}
