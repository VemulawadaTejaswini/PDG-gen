import java.util.*;

public class Main {
	public static void main(String args[]) {
      	Scanner sc = new Scanner(System.in);
      	String S = sc.nextLine();
      	if (YesNo(S)) {
          Yes();
        } else {
          No();
        }
    }
  	public static boolean YesNo(String S) {
      if ((S.length() % 2) != 0) {
        return false;
      }
      for (int i = 0; i < S.length(); i += 2 ) {
        if (S.substring(i,i+1).equals("h") && S.substring(i+1,i+2).equals("i")) {
          continue;
        }
        return false;
      }
      return true;
    }
    public static void Yes() {
      	System.out.println("Yes");
    }
	public static void No() {
		System.out.println("No");
    }
}