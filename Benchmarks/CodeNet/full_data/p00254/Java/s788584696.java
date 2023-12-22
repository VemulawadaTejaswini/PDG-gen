import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static char[] N = new char[4];
	static int L,S;
	public static void main(String[] args){
		while(read()){
			solve();
		}
	}
	
	public static boolean read(){
		String tmp;
		tmp = sc.next();
		if(tmp.equals("0000")) return false;
		N = tmp.toCharArray();
		
		return true;
		
	}
	
	public static void solve(){
		
		int Nint = Integer.parseInt(String.valueOf(N));
		int ans = 0;
		
		while(Nint != 6174){
			Arrays.sort(N);
			S = Integer.parseInt(String.valueOf(N));
			L = ((int)N[3]-48) * 1000 + ((int)N[2]-48) * 100 + ((int)N[1]-48) * 10 + ((int)N[0]-48);
			
			
			Nint = L-S;
			if(Nint == 0) {
				System.out.println("NA"); return;
			}
			
			
			N = String.format("%04d", Nint).toCharArray();			
			ans++;
		}
		
		System.out.println(ans);
		
		return;
	}
}
