import java.util.*;
public class Main {
	public static void main(String[] args){
		while(true) {
	      Scanner scan = new Scanner(System.in);
	      String S = scan.nextLine();
	      int n = S.length();
	      int hug = 0;
	      for (int i=0; i<n/2; i++) {
	          if(S.charAt(i) != S.charAt(n-i-1))hug++;
	      }
	      scan.close();
	      System.out.println(hug);
		}
	}
}