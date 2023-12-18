import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] x = new int[n];
		int p = 0;
		int dist = 0;
		int ans = 0;
		for(int i=0; i<n; i++){
			x[i] = sc.nextInt();
		}

		for(int i=0; i<n-1; i++){
			dist = x[i+1] - x[i];
			if(dist * a < b){
				ans += dist * a;
			}else{
				ans += b;
			}
		}
		System.out.println(ans);
		return;
	}
}