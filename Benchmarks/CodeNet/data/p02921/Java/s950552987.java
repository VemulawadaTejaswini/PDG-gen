import java.util.*;

public class Main {
	public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      String s = scan.next();
      String t = scan.next();
      int count=0;
      for(int i=0; i<3; i++) {
        if(s.charAt(i)==t.charAt(i)){
          count++;
        }
      }
      System.out.println(count);
    }
}