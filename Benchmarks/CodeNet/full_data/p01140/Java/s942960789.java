import java.util.*;
public class Main {
	static Scanner scanner = new Scanner(System.in);
	static int n, m;
	static int[] height, width, h_list, w_list;
	static final int MAX_LENGTH = 1000*1500+1;
	public static void main(String[] args) {
		while( read() ){
			solve();
		}
	}
	
	static boolean read(){
		n = scanner.nextInt();
		m = scanner.nextInt();
		if( n == 0 && m == 0 ) return false;
		height = new int[MAX_LENGTH];
		width = new int[MAX_LENGTH];
		h_list = new int[MAX_LENGTH];
		w_list = new int[MAX_LENGTH];
		for( int i = 0; i < n; i++ ){
			height[i]= scanner.nextInt();
			h_list[height[i]]++;
		}
		for( int i = 0; i < m; i++ ){
			width[i] = scanner.nextInt();
			w_list[width[i]]++;
		}
		return true;
	}
	
	static void solve(){
		int ans = 0;
		addNextStreet(height, h_list, n);
		addNextStreet(width, w_list, m);
		for( int index = 0; index < MAX_LENGTH; index++ ){
			ans += h_list[index] * w_list[index];
		}
		System.out.println(ans);
	}
	
	static void addNextStreet(int[] length, int[] array, int num){
		for(int i = 0; i < num; i++){
			int sum = length[i];
			for(int j = i+1; j < num; j++){
				sum += length[j];
				array[sum]++;
			}
		}
	}
}