import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static int[] point;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		point = new int[n];
		for(int i = 0; i < point.length; i++){
			point[i] = sc.nextInt();
		}
		return true;
	}
	
	static void solve(){
		Arrays.sort(point);
		int score = 0;
		for(int i = 1; i < point.length - 1; i++){
			score += point[i];
		}
		System.out.println(score/(n-2));
	}

}