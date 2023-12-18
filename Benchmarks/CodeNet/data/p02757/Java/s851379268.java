import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static long modpow(long n, long y , long MOD){
		if(y == 0){
			return 1;
		}else if(y == 1){
			return n % MOD;
		}else{
			if(y % 2 == 0){
				long r = modpow(n , y / 2 , MOD);
				return (r * r) % MOD;
			}else{
				long r = modpow(n , y / 2 , MOD);
				long r2 = (r * r) % MOD;
				return (r2 * n) % MOD;				
			}
		}
	}
	static long modinv(long n , long MOD){
		return modpow(n , MOD - 2, MOD);
	}

	static long solveNaive(int arr[] , int P){
		int N = arr.length;
		long ret = 0;
		for(int i = 0 ; i < N ; ++i){
			int p = 0;
			long cnt = 0;
			for(int j = i ; j < N ; ++j){
				int v = arr[j];
				p = (p * 10 + v) % P;
				if(p == 0){
					++cnt;
				}
			}
			ret = ret + cnt;
		}
		return ret;
	}
	static long solve(int arr[] , int P){
		int N = arr.length;
		long ret = 0;
		int C[] = new int[P];		
		int mod10 = (int) modinv(10 % P, P);
		int table[][] = new int[10][P];
		for(int i = 0 ; i < 10 ; ++i){
			for(int p = 0 ; p < P ; ++p){
				int x = (p - i + P * 10) % P;
				int y = (x * mod10) % P;
				table[i][p] = y;				
			}
		}
//		System.out.println(Arrays.deepToString(table));
		int num = 0;
		int base = 1;
		for(int i = N - 1 ; i >= 0 ; --i){
			int v = arr[i];
			num = (num  + v * base) % P;
			base = (base * 10) % P;
			C[num]++;
		}
		ret += C[0];
		List<Long> list = new ArrayList<Long>();
		for(int i = 0 ; i < C.length ; ++i){
			list.add((long)C[i] * (long) P + (long) i);
		}
//		System.out.println(Arrays.toString(C));
		for(int i = N - 2 ; i >= 0 ; --i){
			int prev = arr[i + 1] % P;
			List<Long> next = new ArrayList<Long>();
			for(long v : list){
				int key = (int) (v % P);
				int val = (int) (v / P);
				if(key == prev){
					--val;
				}
				int n = table[prev][key];
				if(n == 0){
					ret += val;
				}
				next.add((long)val * (long) P + n);
 			}
			list = next;
		}
		return ret;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P = sc.nextInt();
		String S = sc.next();
		int arr[] = new int[S.length()];
		for(int i = 0 ; i < S.length() ; ++i){
			arr[i] = S.charAt(i) - '0';
		}
//		System.out.println(solveNaive(arr, P));
		System.out.println(solve(arr, P));

	}
}
