import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int[] c = new int[6];
		for(int i=0; i<6; i++){
			c[i] = scn.nextInt();
		}
      	String ans = "NO";
      	if(c[0]==c[5] && c[1]==c[4] && c[2]==c[3]) ans = "YES";
      	System.out.println(ans);
	}
}
