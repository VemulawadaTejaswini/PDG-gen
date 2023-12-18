import java.util.*;

public class Main{

  public long countStringInString(String target, String searchWord) {
        return (target.length() - target.replaceAll(searchWord, "").length()) / searchWord.length();
    }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int level = scan.nextInt();
    int ex = scan.nextInt();
    String target ="BPPPB";
    if (level!=1) {
      for (int i = 1;i<level ;i++ ) {
        target = "B"+target+"P"+target+"B";
        System.out.println(target);
      }
    }
    target=target.substring(target.length()-ex);
    Main m = new Main();
    System.out.println(m.countStringInString(target,"P"));
  }
}
