import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    while (true) {
      String str = scan.nextLine();
      int sum = 0;

      if (str.equals("0")) {
        break;
      }

      for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        sum += Character.getNumericValue(ch);
      }
      
      System.out.println(sum);
    
    }

  }

}
