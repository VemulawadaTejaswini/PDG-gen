import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int Q = sc.nextInt();
		long INF = 1145141919;
		long[] shrine = new long[A+2];
		long[] temple = new long[B+2];
		shrine[0] = INF*-1;
		temple[0] = INF*-1;
		shrine[A+1] = INF;
		temple[B+1] = INF;
		for(int i=1;i<=A;++i) shrine[i] = sc.nextLong();
		for(int i=1;i<=B;++i) temple[i] = sc.nextLong();
		Arrays.sort(shrine);
		Arrays.sort(temple);

		/*int[] nearT = new int[A];
		int[] nearS = new int[B];
		for(int i=0;i<A;++i) nearT[i] = binery_search(shrine[i],temple,B);
		for(int i=0;i<B;++i) nearS[i] = binery_search(temple[i],shrine,A);*/

		for(int i=0;i<Q;++i){
			long x = sc.nextLong();
			int[] s = {bsearch(x,shrine,A+2), bsearch(x,shrine,A+2)+1};
			int[] t = {bsearch(x,temple,B+2), bsearch(x,temple,B+2)+1};
			long ans = Long.MAX_VALUE;
			for(int j=0;j<4;++j){
				long res1 = Math.abs(shrine[s[j/2]]-x) + Math.abs(temple[t[j%2]]-shrine[s[j/2]]);
				long res2 = Math.abs(temple[t[j%2]]-x) + Math.abs(shrine[s[j/2]]-temple[t[j%2]]);
				ans = Math.min(ans,Math.min(res1,res2));
			}
			System.out.println(ans);
		}
		return;
	}

	public static int bsearch(long x,long[] obj,int index){
		if(index == 1) return 0;
		int left = 0;
		int right = index-1;
		while(left+1<right){
			int center = (left+right)/2;
			if(obj[center]>x) right = center;
			else left = center;
		}
		return left;
	}
}