import java.util.*;

public class AtCoder {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String[] strArray = sc.next().split("");

    Arrays.sort(strArray,new Comparator<String>() {
      @Override
      public int compare(String obj0, String obj1) {
        return obj0.compareTo(obj1);
      }
    });

    if (strArray[0].equals(strArray[1]) && !(strArray[1].equals(strArray[2])) && strArray[2].equals(strArray[3])) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}