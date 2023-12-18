import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { //GIMME AC
		Scanner input = new Scanner(System.in); 
		String S = input.next();
		int N = S.length();
		boolean[] vis = new boolean[200];
		String ans = "";
		for (int i = 0; i < N; i++) {
			vis[(int)(S.charAt(i))]=true;
		}
		for (int i = 97; i <= 122; i++) {
			if (!vis[i]) {
				ans+=Character.toString((char)(i));
				break;
			} 
		}
		System.out.println(ans.equals("")?-1:S+ans);
	}
}