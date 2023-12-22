import java.util.Arrays;
import java.util.Scanner;

//Leaky Cryptography
public class Main{

	int[][] a;
	int[] cs, t;
	char[] key;
	
//	boolean check(int[][] a, int[] c, int[] key){
//		int[] t = new int[32];
//		int carry = 0;
//		for(int i=31;i>=0;i--){
//			int s = carry;
//			for(int j=0;j<8;j++){
//				if(key[i]==0)s+=a[j][i];
//				else s+=(a[j][i]+1)%2;
//			}
//			t[i] = s%2;
//			carry = s/2;
//		}
//		for(int i=31;i>=0;i--){
//			if(key[i]==0&&t[i]!=c[i])return false;
//			if(key[i]==1&&t[i]!=(c[i]+1)%2)return false;
//		}
//		return true;
//	}
	
	boolean dfs(int k, int c){
		if(k==-1){
			return true;
//			return check(a, cs, key);
		}
//		key[k] = 0;
//		if(dfs(k-1, c))return true;
//		key[k] = 1;
//		if(dfs(k-1, c))return true;
//		return false;
		key[k] = '0';
		int x = c;
		for(int i=0;i<8;i++){
			x+=a[i][k];
		}
		if(x%2==cs[k]){
			if(dfs(k-1, x/2))return true;
		}
		key[k] = '1';
		x = c;
		for(int i=0;i<8;i++){
			x+=(a[i][k]+1)%2;
		}
		if(x%2==(cs[k]+1)%2){
			if(dfs(k-1, x/2))return true;
		}
		return false;
	}
	
	int[] make(String s){
		int[] r = new int[32];
		long x = Long.parseLong(s, 16);
		int i = 31;
		while(x>0){
			r[i--] = (int) (x%2);
			x>>=1;
		}
		return r;
	}
	
//	String tohex(int[] key){
//		String res = "";
//		int j = 0;
//		for(int i=0;i<8;i++){
//			String r = "";
//			for(int k=0;k<4;k++)r+=key[j++];
//			
//		}
//	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T--!=0){
			a = new int[8][32];
			for(int i=0;i<8;i++)a[i] = make(sc.next());
			cs = make(sc.next());
			key = new char[32];
//			System.out.println(check(a, cs, make(sc.next())));
			dfs(31, 0);
			String k = new String(key);
			long l = Long.parseLong(k, 2);
			System.out.println(String.format("%h", l));
//			debug(key);
//			for(int i=0;i<8;i++)debug(a[i]);
//			debug(cs);
//			key = new char[32];
//			dfs(31, 0);
//			System.out.println(new String(key));
		}
	}
	
	void debug(Object...o){
		System.out.println(Arrays.deepToString(o));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}