import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int Q = sc.nextInt();
		long[] shrine = new long[A];
		long[] temple = new long[B];
		for(int i=0;i<A;++i) shrine[i] = sc.nextLong();
		for(int i=0;i<B;++i) temple[i] = sc.nextLong();
		Arrays.sort(shrine);
		Arrays.sort(temple);

		int[] nearT = new int[A];
		int[] nearS = new int[B];
		for(int i=0;i<A;++i) nearT[i] = binery_search(shrine[i],temple,B);
		for(int i=0;i<B;++i) nearS[i] = binery_search(temple[i],shrine,A);

		for(int i=0;i<Q;++i){
			long x = sc.nextLong();
			int s_index = binery_search(x,shrine,A);
			int t_index = binery_search(x,temple,B);
			long ans1 = Math.abs(x-shrine[s_index]) + Math.abs(shrine[s_index]-temple[nearT[s_index]]);
			long ans2 = Math.abs(x-temple[t_index]) + Math.abs(temple[t_index]-shrine[nearS[t_index]]);
			System.out.println(Math.min(ans1,ans2));
		}
		return;
	}

	public static int binery_search(long x,long[] obj,int index){
		if(index == 1) return 0;
		int left = 0;
		int right = index-1;
		while(left+1<right){
			int center = (left+right)/2;
			if(obj[center]>x) right = center;
			else left = center;
		}
		if(Math.abs(x-obj[left])<Math.abs(x-obj[left+1])) return left;
		else return left+1;
	}
}