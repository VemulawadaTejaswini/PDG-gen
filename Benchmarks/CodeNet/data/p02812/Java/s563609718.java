import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String n = scan.nextLine();
    String s = scan.nextLine();

    String[] strs = s.split("ABC");
    System.out.println(strs.length -1);

    scan.close();
  }
}