import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	private static int a, b;
	
	private static void solve(){
		int c = a + b;
		System.out.println(Integer.toString(c).length());
	}
	
	public static void main(String[] args) throws Exception{
//		File file = new File("in.txt");
//		Scanner in = new Scanner(file);	
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			a = in.nextInt();
			b = in.nextInt();
			solve();
		}
	}
}