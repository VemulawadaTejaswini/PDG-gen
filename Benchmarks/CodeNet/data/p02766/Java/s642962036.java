import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String sValue = sc.nextLine();
    String[] sSplitVal = sValue.split(" ");
    String s1 = sSplitVal[0];
    int i2 = Integer.parseInt(sSplitVal[1]);
    String sm = Long.toString(Long.parseLong(s1, 10), i2);
    System.out.print(sm.length());
  }
}
