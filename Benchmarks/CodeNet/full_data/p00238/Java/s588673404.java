import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int t, n;
	static int[] s, f;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		t = sc.nextInt();
		if(t == 0)return false;
		n = sc.nextInt();
		s = new int[n];
		f = new int[n];
		for(int i = 0; i < n; i++){
			s[i] = sc.nextInt();
			f[i] = sc.nextInt();
		}
		return true;
	}
	
	static void solve(){
		int time = 0;
		for(int i = 0; i < n; i++){
			time += f[i] - s[i];
		}
		if(time > t){
			System.out.println("OK");
		}else{
			System.out.println(t-time);
		}
	}

}