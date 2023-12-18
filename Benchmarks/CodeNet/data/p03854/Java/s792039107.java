import java.util.*;

public class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String[] ss = s.split("");
    String word = "";
    for(int i = s.length() - 1; i >= 0; i--) {
      word += ss[i];
      if(word.equals("resare") || word.equals("esare") ||
         word.equals("remaerd") || word.equals("maerd")) {
        word = "";
        if(i == 0) {
          System.out.println("YES");
        }
      }

      if(i == 0 && word.length() != 0) {
        System.out.println("NO");
      }
    }
  }
}
