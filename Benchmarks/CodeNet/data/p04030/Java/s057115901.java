import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String[] s = scanner.next().split("");
    ArrayList<String> result = new ArrayList<>();
    
    for(int i = 0; i < s.length; i++) {
      if(s[i].equals("0") || s[i].equals("1")) {
        result.add(s[i]);
      } else if(result.size() >= 1) {
        result.remove(result.size() - 1);
      }
    }
    
    for(String r: result) {
      System.out.print(r);
    }
  }
}