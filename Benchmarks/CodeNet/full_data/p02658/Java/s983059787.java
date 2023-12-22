import java.util.Scanner;
public class Main {
  public static final long max = (long)Math.pow(10,18);
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	long result = 1;
        for (int i=0; i<sc.nextInt(); i++) {
          long next = sc.nextLong();
          result = result * next;
          if (result > max) {
            System.out.println("-1");
            return;
          }
        }
        System.out.println(String.valueOf(result));
    }
}
