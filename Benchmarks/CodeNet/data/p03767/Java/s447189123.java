import java.util.Arrays;
import java.util.Scanner;

public class Main{

	static Scanner s=new Scanner(System.in);

	public static void main(String __[]){
		input();
		solve();
	}


	static int n,in[];
	private static void input(){
		n=s.nextInt();
		in=new int[n*3];
		for(int i=0;i<n*3;i++)
			in[i]=s.nextInt();
	}

	private static void solve(){
		Arrays.sort(in);
		long res=0;
		for(int i=0;i<n;i++)
			res+=in[i*2+n];
		System.out.println(res);
	}
}
