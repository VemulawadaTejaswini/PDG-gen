import java.util.*;

public class Main {
	
	private int[] fib = new int [45];
	
	Main() {
		for(int i=0;i<45;i++) {
			if(i<=1)fib[i]=1;
			else fib[i]=fib[i-1]+fib[i-2];
		}
	}
	
	int get(int n) {
		return fib[n];
	}
	
	public static void main(String[] args) {
		System.out.println(new Main().get(new Scanner(System.in).nextInt()));
	}
}
