import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Darts
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt(), m = sc.nextInt();
			if((n|m)==0)break;
			int[] p = new int[n+1];
			for(int i=0;i<n;i++)p[i]=sc.nextInt();
			Set<Integer> set = new HashSet<Integer>();
			for(int i=0;i<=n;i++)for(int j=0;j<=i;j++)if(p[i]+p[j]<=m)set.add(p[i]+p[j]);
			int[] a = new int[set.size()];
			int N = 0;
			for(int x:set)a[N++] = x;
			Arrays.sort(a);
			int max = 0;
			for(int i=0;i<N;i++){
				int d = m-a[i];
				int l = 0;
				int r = N-1;
				while(r-l>1){
					int mid = (l+r)/2;
					if(a[mid]<=d)l=mid;
					else r=mid;
				}
				if(a[r]<=d)max = Math.max(max, a[i]+a[r]);
				else max = Math.max(max, a[i]+a[l]);
			}
			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}