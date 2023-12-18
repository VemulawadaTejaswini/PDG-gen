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
		int a=s.nextInt(),b;
		char op=s.next().charAt(0);
		b=s.nextInt();
		System.out.println(op=='+'?a+b:a-b);
	}
}
