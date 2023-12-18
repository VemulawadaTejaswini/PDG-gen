import java.util.Scanner;

public class Main{

	static final Scanner	s	=new Scanner(System.in);

	public static void main(String args[]){
		input();
		solve();
	}

	private static void input(){
	}

	private static void solve(){
		int x=0,max=0;
		s.next();
		char in[]=s.next().toCharArray();
		for(char c:in) {
			x+=c=='I'?1:-1;
			max=Math.max(x,max);
		}
		System.out.println(max);
	}
}
