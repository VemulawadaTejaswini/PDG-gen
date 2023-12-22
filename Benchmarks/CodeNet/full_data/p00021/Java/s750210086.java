import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
static Scanner in = new Scanner(System.in);

public static void main(String[] args) {
  in.nextInt();
  while (in.hasNext()) {
	BigDecimal ax, ay, bx, by;
	{
	  BigDecimal x = in.nextBigDecimal();
	  BigDecimal y = in.nextBigDecimal();
	  ax = in.nextBigDecimal().subtract(x);
	  ay = in.nextBigDecimal().subtract(y);
	}
	{
	  BigDecimal x = in.nextBigDecimal();
	  BigDecimal y = in.nextBigDecimal();
	  bx = in.nextBigDecimal().subtract(x);
	  by = in.nextBigDecimal().subtract(y);
	}
	boolean is;
	{
	  is = ax.multiply(by).equals(ay.multiply(bx));
	  System.out.println(is ? "YES" : "NO");
	}
  }
}
}