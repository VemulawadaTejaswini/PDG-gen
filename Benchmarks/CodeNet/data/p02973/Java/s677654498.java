import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		int last = Integer.MAX_VALUE;
		int ans = 1;
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		for(int i = 0; i < n-1; i++) {
			if(a[i] >= a[i+1] && last >= a[i+1]) {
				//System.out.println(i + " "+a[i] +" " + a[i+1]+ " "+ last);
				last = a[i];
				ans++;
				//System.out.println(last + " "+ ans);
			}
		}
			
		System.out.println(ans);
	}

}
