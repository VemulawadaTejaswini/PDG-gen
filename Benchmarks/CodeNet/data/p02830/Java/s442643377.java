import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int iNum = sc.nextInt();
    sc.nextLine();
    String sStr = sc.nextLine();
    String[] sSplitStr = sStr.split(" ");
    String s1 = sSplitStr[0];
    String s2 = sSplitStr[1];
    String[] s1Split = s1.split("");
    String[] s2Split = s2.split("");
    List<String> listStr = new LinkedList<String>();
    for (int i = 0; i < iNum; i++) {
      listStr.add(s1Split[i]);
      listStr.add(s2Split[i]);
    }
    StringBuilder sb = new StringBuilder();
    for (String str : listStr) {
      sb.append(str);
    }
    System.out.printf(sb.toString());
  }
}
