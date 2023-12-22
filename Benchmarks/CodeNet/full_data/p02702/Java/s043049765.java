import java.util.Scanner;
import java.math.BigInteger;

class Main {
  public static void main(String[] args) {  
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    BigInteger integer;
    BigInteger check = BigInteger.valueOf(2019);
    int count = 0;
    for (int i = 0; i <= str.length(); i++) {
      for (int j = i+1; j <= str.length(); j++) {
        String substr = str.substring(i, j);
        integer = new BigInteger(substr);
        if (integer.mod(check) == BigInteger.ZERO)
          count++;
      }
    }
    System.out.println(count--);
    scanner.close();
  }
}