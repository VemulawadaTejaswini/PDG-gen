
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		
		long sum=A-B+(B-A)*(N-1)+1;
		
		if(A>B || N<2)System.out.println(0);
		else System.out.println(sum);
		
	}

}