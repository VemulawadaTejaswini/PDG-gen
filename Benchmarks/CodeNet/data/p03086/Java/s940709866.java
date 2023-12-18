import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String[] sArray = s.split("");
    List<String> acgt = Arrays.asList("A", "C", "G", "T");

    int count = 0;
    int maxCount = 0;
    for (int i = 0; i < s.length() ; i++ ) {
      if (acgt.contains(sArray[i])) {
        count++;
      } else {
        if (count > maxCount) {
          maxCount = count;
        }
      }
    }

    System.out.println(maxCount);
  }
}
