import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int s = scn.nextInt();
		int w = scn.nextInt();
      	String ans="safe";
      	if(w>=s) ans="unsafe";
      	System.out.println(ans);
	}
}