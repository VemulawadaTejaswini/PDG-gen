import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int num = S.length();
    int max = 0;
    int count = 0;
    
    for(int i=0; i<num; i++) {
      String str = S.substring(i,i+1);
      if(str.equals("A") || str.equals("C") || str.equals("G") || str.equals("T")) {
        count++;
      	if(max < count) {
        	max = count;
      	}
      } else {
        count = 0;
      }

    }
   System.out.println(max);
  }
}