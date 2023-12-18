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
		long a=s.nextLong(),b=s.nextLong(),m=s.nextLong();
		System.out.println(b/m-a/m+((a%m==0&&b%m==0)?1:0));
	}
}
