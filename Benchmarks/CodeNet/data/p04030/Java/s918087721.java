
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int p = 0; 
		char ans[];
		ans = new char[10];		
		
		for(int i = 0; i < s.length(); ++i) {
			if(s.charAt(i) == 'B') {
				if(p != 0)--p;
				ans[p] = '\0';
			}
			else ans[p++] = s.charAt(i);
		}
		
		String ans1 = "";
		int i = 0;
		while(ans[i] != '\0')
		ans1 += ans[i++];
		
		System.out.println(ans1);
		sc.close();
	}

}
