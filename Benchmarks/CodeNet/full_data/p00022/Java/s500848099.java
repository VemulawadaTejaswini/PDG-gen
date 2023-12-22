import java.util.Scanner;


public class Main{

	static Scanner sc = new Scanner(System.in);
	
	static int n, max, sum;
	static int a[];
	public static void main(String[] args) {
		
		while(read()){
			solve();
		}
	}
	
	public static boolean read(){
		
		n = sc.nextInt();
		
		if(n == 0) return false;
		
		a = new int[n];
		
		for(int i=0; i < n; i++){
			a[i] = sc.nextInt();
		}
		
		return true;
	}
	
	public static void solve(){

		sum = a[0];
		max = sum;
		
		for(int i=1; i < n; i++){
			sum += a[i];
			if(max < sum) max = sum;
		}
		
		System.out.println(max);
	}

}