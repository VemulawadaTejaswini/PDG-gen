import java.util.Scanner;


public class Main{

	static Scanner sc = new Scanner(System.in);
	
	static int n, max;
	static int a[], best[];
	public static void main(String[] args) {
		
		while(read()){
			solve();
		}
	}
	
	public static boolean read(){
		
		n = sc.nextInt();
		
		if(n == 0) return false;
		
		a = new int[n+1];
		best = new int[n+1];
		
		for(int i=1; i < n+1; i++){
			a[i] = sc.nextInt();
		}
		
		return true;
	}
	
	public static void solve(){

		max = Integer.MIN_VALUE;
		
		for(int i=1; i < n+1; i++){
			best[i] = Math.max(a[i], a[i] + best[i-1]);
			max = Math.max(max, best[i]);
		}
		
		System.out.println(max);
	}

}