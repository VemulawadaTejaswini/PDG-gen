import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A = sc.nextInt();
		int[] a = new int[A];
		
		int smax = 1000;
		int imax = Collections.max(a);
		int ans;
		
		for(int i = 0; i <a.length; i++){
			ans = imax / (N + A);
			}
		}
		System.out.print(ans);
	}

