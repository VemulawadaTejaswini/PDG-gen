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
      if (S.length() < 2) {
        return false;
      }
      if (S.length() == 2) {
        if (S.equals("hi")) {
			return true;
        }
        return false;
      }
      for (int i = 0; i < S.length() - 1; i++ ) {
        if (S.substring(i,i+1).equals("h")) {
			if (S.substring(i+1,i+2).equals("i")) {
              if (i+2 == S.length()) {
				return true;
              }
              if (S.substring(i+2,i+3).equals("i") == false) {
                return true;
              }
            }
        }
      }
      return false;
    }
    public static void Yes() {
      	System.out.println("Yes");
    }
	public static void No() {
		System.out.println("No");
    }
}