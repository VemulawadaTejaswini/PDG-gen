import java.util.*;

class Main{
	static Scanner s=new Scanner(System.in);

	static class D{
		public D(int a,int b){
			this.a=a;
			this.b=b;
		}
		int a,b;
	}
	public static void main(String[] $){
		int n=s.nextInt(),m=s.nextInt();
		Map<Integer,Set<Integer>> to=new HashMap<>();
		Map<Integer,Set<Integer>> from=new HashMap<>();

		BitSet _root=new BitSet(n);
		_root.set(0,n);

		for(int e=n+m-1;e>0;--e){
			int f=s.nextInt()-1;
			int t=s.nextInt()-1;
			to.computeIfAbsent(f,i->new HashSet<>()).add(t);
			from.computeIfAbsent(t,i->new HashSet<>()).add(f);
			_root.clear(t);
		}

		int root=_root.nextSetBit(0);
		
		if(root==-1) {
			System.out.println(0);
			return;
		}

		int[] parent=new int[n];

		ArrayDeque<Long> q=new ArrayDeque<>();
		for(int i:to.get(root)){
			q.add((long)root*n+i);
		}
		
		while(!q.isEmpty()){
			for(int _q=q.size();_q>0;--_q){
				long p=q.poll();
				int pf=(int)p/n;
				int pt=(int)p%n;
				from.get(pt).remove(pf);
				if(from.get(pt).isEmpty())
					parent[pt]=pf+1;

				if(to.containsKey(pt)){
					for(int i:to.get(pt)){
						q.add((long)pt*n+i);
					}
				}
			}
		}
		Arrays.stream(parent).forEach(System.out::println);
	}
}