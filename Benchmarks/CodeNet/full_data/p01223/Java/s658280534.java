import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, t;
	static int[] stair;
	public static void main(String[] args) {
		while(read()){
			
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			t = sc.nextInt();
			stair = new int[t];
			for(int j = 0; j < stair.length; j++){
				stair[j] = sc.nextInt();
			}
			solve();
		}
		return true;
	}
	
	static void solve(){
		int min = 0, max = 0;
		for(int i = 0; i < stair.length-1; i++){
			max = Math.max(max, stair[i+1]-stair[i]);
			min = Math.max(min, stair[i]-stair[i+1]);
		}
		System.out.println(max + " " + min);
	}

}