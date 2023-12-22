import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int[] a = new int [n];
		for (int i = 0;i < n; ++i){
			a[i] = Integer.parseInt(scan.next());
		}
		int ans = 0;
		for (int i = 0; i < n; ++i){
			for (int k = i+1; k < n; ++k){
				if (k-i == a[i]+a[k])++ans;
			}
		}
		System.out.print(ans);
	}
}

//end