import java.util.*;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		String ans[] = {"Yes", "No"};
		int an = 1;
		char st = s.charAt(0);
		for(int i = 0; i < s.length(); ++i){
			if(st != s.charAt(i))an = 0;
		}
		System.out.println(ans[an]);
	}
}
