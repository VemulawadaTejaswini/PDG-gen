import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String n = scan.nextLine();
    String s = scan.nextLine();

    String result = s.replaceAll("ABC", "0");

    int i = 0;
    int count = 0;
    while (i < result.length()) {
      if ("0".equals(String.valueOf(result.charAt(i)))) {
        count++;
      }
      i++;
    }
    System.out.println(count);

    scan.close();
  }
}