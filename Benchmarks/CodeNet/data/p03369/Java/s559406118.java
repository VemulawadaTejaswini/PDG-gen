import java.util.*;

class Main{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int ans = 700;
		String s = sc.next();
		for(int i = 0; i < 3; i++){
			if(s.charAt(i) == 'o') ans += 100;
		}
		System.out.println(ans);
	}
}