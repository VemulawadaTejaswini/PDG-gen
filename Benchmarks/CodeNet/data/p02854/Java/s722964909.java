import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int[] a = new int[n];
		int len = 0;
		for(int i = 0;i < n; ++i){
			a[i] = Integer.parseInt(scan.next());
			len += a[i];
		}
		int ans = Integer.MAX_VALUE;
		int right = len;
		int left = 0;
		for(int i:a){
			right -= i;
			left += i;
			ans = Math.min(ans,Math.abs(len/2 - right) + Math.abs(len/2 - left));
		}
		System.out.print(ans);       			       
	}
}

