import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static boolean[] Monday_Saturday = new boolean[300001];
	public static void main(String[] args){
		make();
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		if(n == 1)return false;
		
		return true;
	}
	
	static void solve(){
		System.out.print(n+":");
		for(int i = 2; i <= n; i++){
			if(Monday_Saturday[i] && (n % i) == 0){
				System.out.print(" "+i);
			}
		}
		System.out.println();
	}
	
	static void make(){
		Arrays.fill(Monday_Saturday, true);
		Monday_Saturday[0] = false;
		Monday_Saturday[1] = false;
		for(int i = 2; i < Monday_Saturday.length; i++){
			if(i % 7 != 1 && i % 7 != 6){
				Monday_Saturday[i] = false;
				continue;
			}
			for(int j = 2*i; j < Monday_Saturday.length; j += i){
				Monday_Saturday[j] = false;
			}
		}
	}
}