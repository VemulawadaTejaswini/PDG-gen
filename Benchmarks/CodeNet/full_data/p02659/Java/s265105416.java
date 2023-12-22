import java.io.*;
import java.util.Scanner;
import java.math.BigDecimal;
 
class Main {
  public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    Double b = scanner.nextDouble();
    b = b * 100;
    BigDecimal bd = BigDecimal.valueOf(b);
    int c = bd.intValue();
    long d = a * c;
    d = d / 100;
    System.out.println(d);
  };
};