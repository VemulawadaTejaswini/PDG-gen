import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		new Main().io();
	}
	
	String solve(int n){
		n = n%39;
		if(n==0) n=39;
		
		String str = Integer.toString(n);
		if(0<=n && n<=9) str = "0" + str;
		
		return "3C" + str;
	}
	
	void io(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			System.out.println(solve(n));
		}
		
		sc.close();
	}
	
	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}