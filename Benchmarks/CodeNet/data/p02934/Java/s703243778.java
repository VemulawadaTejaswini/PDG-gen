import java.util.*;
public class Main {	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int aa = sc.nextInt();
		int x[] = new int[aa];
		for(int n = 0; n < aa; n++){
			x[n] = sc.nextInt();
		}
		int a = 1;
		int b = x[0];
		for(int n=1; n < aa; n++){
			a = a*x[n] + b;
			b *= x[n];
			int t = f(Math.max(a, b), Math.min(a, b));
			a = a / t;
			b = b / t;
		}
		System.out.println((double)b/(double)a);
		
		
	}
	
	public static int f(int a, int b){
		int t = a % b;
		if(t == 1)return 1;
		else if(t == 0)return b;
		else return f(b, t);
	}
}