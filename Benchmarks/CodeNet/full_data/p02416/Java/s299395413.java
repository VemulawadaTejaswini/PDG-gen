import java.util.Arrays;
import java.util.Scanner;

public class Main{

	static Scanner s=new Scanner(System.in);

	public static void main(String __[]){
		while(true) {
			input();
			if(in.charAt(0)=='0') return;
			solve();
		}
	}

	static String in;
	private static void input(){
		in=s.next();
	}

	private static void solve(){
		int[] x=new int[in.length()];
		for(int i=0;i<in.length();i++)
			x[i]=in.charAt(i)-'0';
		System.out.println(Arrays.stream(x).parallel().sum());
	}
}