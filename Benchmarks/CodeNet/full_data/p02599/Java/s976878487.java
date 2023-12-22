import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    scan.nextLine(); // N と Q の行読み飛ばし
    String str = scan.nextLine();
    String[] array = str.split(" ");
    List<String> list = Arrays.asList(array);

    while (scan.hasNext()) {
      str = scan.nextLine();
      String[] strs = str.split(" ");
      int l = Integer.parseInt(strs[0]);
      int r = Integer.parseInt(strs[1]);

      List<String> sbList = list.subList(l-1, r);
      System.out.println(new HashSet<>(sbList).size());
    }
  }