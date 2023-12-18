
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
		
		long sum=(B-A)*(N-2)+1;
		
		if(A>B)System.out.println(0);
		else if(N==1 && A!=B)System.out.println(0);
		else System.out.println(sum);
		
	}

}
