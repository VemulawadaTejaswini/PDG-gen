import java.util.*;
 
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String s = sc.next();
      	int charSize = s.length()-2;
      	int y = 0;
      	for(int x = 1; x <=charSize; x++) {
          String t = s.substring(x-1, x+2);
          if (t.equals("ABC")) {
            y++;
            String start = s.substring(0, x-1);
            String end = s.substring(x+2);
            s = start + "BCA" + end;
            x=0;
            charSize = s.length()-2;
          }
        }
          System.out.println(y);
    }
}