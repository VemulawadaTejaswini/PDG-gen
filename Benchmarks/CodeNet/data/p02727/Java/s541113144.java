import java.util.*;


class Main{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		LinkedList<Integer> p =new LinkedList();
		LinkedList<Integer> q =new LinkedList();
		LinkedList<Integer> r =new LinkedList();
		
		int ans=0;
		
		for(int i=0;i<a;i++){
			p.add(sc.nextInt());
		}
		
		for(int i=0;i<b;i++){
			q.add(sc.nextInt());
		}
		
		for(int i=0;i<c;i++){
			r.add(sc.nextInt());
		}
		Collections.sort(p);
		Collections.sort(q);
		Collections.sort(r);
		
		ans+=p.pollLast();
		ans+=q.pollLast();
		
		LinkedList<Integer> all =new LinkedList();
		
		for(int i=0;i<x-1;i++){
			all.add(p.pollLast());
		}
		
		for(int i=0;i<y-1;i++){
			all.add(q.pollLast());
		}
		
		for(int i=0;i<c;i++){
			all.add(r.pollLast());
		}
		
		Collections.sort(all);
		
		for(int i=0;i<x+y-2;i++){
			ans+=all.pollLast();
		}
		
		System.out.print(ans);
	}
}
	


