import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt();
		int[] a=new int[n];
		Arrays.setAll(a,i->s.nextInt());

		int v=0,j=Math.min(n,k);
		for(int l=0;l<=j;++l){
			for(int r=0;l+r<=j;++r){
				Queue<Integer> q=new PriorityQueue<>();
				for(int i=0;i<l;++i)
					q.add(a[i]);
				for(int i=0;i<r;++i)
					q.add(a[n-1-i]);
				for(int i=k-l-r;i>0&&!q.isEmpty()&&q.peek()<0;--i)
					q.poll();
				v=Math.max(v,q.stream().mapToInt(i->i).sum());
			}
		}
		System.out.println(v);
	}
}
