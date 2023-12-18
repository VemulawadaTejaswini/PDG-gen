import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());scan.nextLine();
		int[] a = new int[n];
		int min =Integer.MAX_VALUE;
		int max =0;
		for (int i =0;i < n; ++i){
			a[i]=Integer.parseInt(scan.next());
			min = Math.min(a[i], min);
			max = Math.max(a[i], max);
		}
		int ans =0;
		int count;
		for (int i = min; i <= max; ++i ){
			count = 0;
			for (int k:a){
				if (k-1<=i && i<=k+1)++count;
			}
			ans = Math.max(ans, count);
		}
		System.out.print(ans);




	}
}
//end
