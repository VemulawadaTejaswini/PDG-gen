import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long A=sc.nextLong();
		long B=sc.nextLong();
		
		long sum=(B-A)*(N-2)+1;
		
		if(A>B)System.out.println(0);
		else if(N==1){
			if(A!=B)System.out.println(0);
			else System.out.println(1);
		}
		else System.out.println(sum);
		
	}

}
