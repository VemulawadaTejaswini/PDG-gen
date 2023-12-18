import java.util.Arrays;
import java.util.Scanner;

class Count implements Comparable{
	int id;
	int cnt;
	@Override
	public int compareTo(Object o) {
		return Integer.compare(this.cnt,((Count) o).cnt);

	}

}

public class Main {



	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N=sc.nextInt();

		int[] a=new int[N];
		int[] b=new int[N];
		for(int i=1;i<=N-1;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();

		}
		Integer [] c=new Integer[N];
		for(int i=0;i<N;i++) {
			c[i]=sc.nextInt();
		}
		Count[] cnt=new Count[N+1];
		for(int i=0;i<N+1;i++) {
			cnt[i]=new Count();
		}
		for(int i=1;i<=N-1;i++) {
			cnt[a[i]].id=a[i];
			cnt[a[i]].cnt++;
			cnt[b[i]].id=b[i];
			cnt[b[i]].cnt++;

		}
		Arrays.sort(cnt);
		for(Count cn:cnt) {
//			if(cn==null)continue;
		//	System.out.println(cn.id+"\t"+cn.cnt);
		}
		Arrays.sort(c);
		//Arrays.sort(c, Comparator.reverseOrder());
		for(int ic:c) {
			//System.out.println(ic);
		}

		int []ans=new int[N+1];
		for(int i=1;i<=N;i++) {
			int tar=cnt[i].id;
			ans[tar]=c[i-1];
		}
		int sum=0;
		for(int i=1;i<=N-1;i++) {
			int A=ans[a[i]];
			int B=ans[b[i]];
		int t=Math.min(A,B);
		sum+=t;
		}
		System.out.println(sum);
		
		
		for(int i=1;i<=N;i++) {
			System.out.print(ans[i]+" ");
		}
		System.out.println();

	}

}
