import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
      	String T = sc.nextLine();
      	int min = Integer.MAX_VALUE;
      int s = S.length();
      int t = T.length();
      for(int i=0; i<=s-t; i++){
        int count = 0;
        for(int j=0; j<t; j++){
          if(S.charAt(i+j) == T.charAt(j)) count++;
        }
        min = Math.min(min, count);
      }
      	System.out.println(t - min);
	}
}