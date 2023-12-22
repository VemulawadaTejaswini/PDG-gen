import java.util.Scanner;


public class Main{

	static Scanner sc = new Scanner(System.in);
	
	static int n, ans;
	
	public static void main(String[] args) {
		
		while(read()){
			solve();
		}
		
	}
	
	public static boolean read(){
		if(!sc.hasNext()) return false;
		
		n = sc.nextInt();
		
		return true;
	}
	
	public static void solve(){
		
		ans = 1;
		for(int i = n; i > 0; i--){
			ans *= i; 
		}
		
		System.out.println(ans);
		
	}

}