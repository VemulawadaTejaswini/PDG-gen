import java.util.Scanner;

public class Main {
	public static void main(String[] args) {      
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      String T = sc.next();
      int check =0;
      for (int i=0; i<S.length(); i++) {
        if (S.charAt(i) == T.charAt(i)) check++;
      }
      if (check == S.length()) {
      System.out.println("Yes");
      } else {
          System.out.println("No");
      }
    }
}