import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int k = Integer.parseInt(scan.next());
		int[] a = new int[n];
		for(int i = 0;i < n; ++i){
			a[i] = Integer.parseInt(scan.next());
		}
		int[] isumo = new int[n];
		for(int i = 0;i < k; ++i){
			for(int j = 0;j < n; ++j){
				int start = Math.max(j-a[j],0);
				int end = j+a[j]+1;
				isumo[start]++;
				if(end < n){
					isumo[end]--;
				}

				}
				a[0] = isumo[0];
				isumo[0] = 0;
				for(int j = 1;j < n ; ++j){
					a[j] = a[j-1]+isumo[j];
					isumo[j] = 0;
				}
		}
		for(int i = 0;i < n; ++i){
			System.out.print(a[i]+" ");
		}


	}
}