import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		return true;
	}
	
	static void solve(){
		int sum = 0;
		for(int i = 1; i < n; i++){
			if(n%i == 0) sum += i;
		}
		if(sum == n){
			System.out.println("perfect number");
		}else if(sum > n){
			System.out.println("abundant number");
		}else{
			System.out.println("deficient number");
		}
	}

}