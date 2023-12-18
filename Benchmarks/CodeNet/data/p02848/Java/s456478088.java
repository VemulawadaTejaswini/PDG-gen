import java.util.*;

public class Main {
  public static void main(String args[]) {
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    String S = sc.next();
    sc.close();
    
    String ans = "";
    for (int i = 0; i < S.length(); i++) {
      for (int j = 0; j < alphabet.length(); j++) {
        if (S.substring(i, i+1).equals(alphabet.substring(j, j+1))) {
			ans += alphabet.substring((j + N) % alphabet.length(), ((j + N) % alphabet.length())+1);
        }
      }
    }
    System.out.println(ans);
  }
}