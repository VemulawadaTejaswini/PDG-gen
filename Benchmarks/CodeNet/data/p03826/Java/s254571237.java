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
		System.out.println(Math.max(s.nextInt()*s.nextInt(),s.nextInt()*s.nextInt()));
	}
}
