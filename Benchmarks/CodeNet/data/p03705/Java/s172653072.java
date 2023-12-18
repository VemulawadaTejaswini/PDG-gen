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
		long sumMax=A+B*(N-1);
		long sumMin=B+A*(N-1);
		if(sumMax-sumMin+1<0)System.out.println(0);
		else System.out.println(sumMax-sumMin+1);
	}

}
