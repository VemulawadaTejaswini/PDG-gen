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
		long a=s.nextLong()-1,b=s.nextLong(),x=s.nextLong();
		System.out.println((b/x)-(a/x));
	}
}
