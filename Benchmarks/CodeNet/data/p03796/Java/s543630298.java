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
		long n=s.nextInt(),res=1;
		for(int i=1;i<=n;i++) {
			res*=i;
			res%=1000000007;
		}
		System.out.println(res);
	}
}
