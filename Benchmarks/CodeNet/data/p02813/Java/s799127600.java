
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		int []b = new int [n];
		
		for(int i = 0 ;i < n;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		
		for(int i = 0 ;i < n;i++) {
			b[i] = Integer.parseInt(sc.next());
		}
		
		int aid = 0;
		int bid = 0;
		
		int N = 1;
		
		for(int i = 1 ;i <= n ;i++) {
			N *= i;
		}
		
		int A =solve(n,N,a);
		int B =solve(n,N,b);
		
		int ans = Math.abs(A - B);
		
		System.out.println(ans);
		
		}
	static int solve(int n , int N , int []a) {
		
		int min = 0;
		List <Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < n ; i++) {
		int cnt = 0;
		for(int j = 1 ;j <= n; j++) {
			if(!list.contains(j)) {
				cnt++;
				if(a[i] == j) {
					list.add(j);
					break;
				}
			}
		}
			min += N/(n-i) * (cnt-1); 
			N = N / (n-i);
	}
		
		return min;
	}
	}
