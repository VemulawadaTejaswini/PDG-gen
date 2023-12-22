import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Numoeba
public class Main{
	
	class R{
		int id, val, pre;
		R parent;
		Set<R> child, copy;
		boolean candidateLeaf;
		public R(int id, int val, R parent) {
			this.id = id;
			pre = this.val = val;
			this.parent = parent;
			child = new HashSet<R>();
			copy = new HashSet<R>();
		}
		void nextVal(){
			pre = val;
			val = 3*val+1;
			while((val&1)==0)val>>=1;
			val%=L;
//			System.out.println("From:"+pre+" Now:"+val);
			candidateLeaf = child.isEmpty() && pre < val;
			for(R r:child)r.nextVal();
		}
		void shrink(){
			if(val==1){
				parent.child.remove(this);
				if(child.size()==1){
					R r = null;
					for(R t:child)r=t;
					r.parent = parent;
					parent.child.add(r);
					r.shrink();
				}
				return;
			}
			copy.clear();
			copy.addAll(child);
			for(R r:copy)r.shrink();
			if(candidateLeaf){
//			if(child.isEmpty() && pre < val){
				int k = (val+1)>>1;
				if((k&1)==0)k++;
//				System.out.println("LeafBonus: from:"+val+" k:"+k);
				child.add(new R(ID++, k, this));
			}
		}
		void findLeader(){
			cnt++;
			if(max < val){
				next = this;
				max = val;
				c = 1;
			}
			else if(max==val)c++;
			for(R r:child)r.findLeader();
		}
		void rev(R p){
//			System.out.println("Rev: this:"+val+" parent:"+p.val);
			child.remove(p);
			if(parent==null){
				parent = p;
				return;
			}
			parent.rev(this);
			child.add(parent);
			parent = p;
		}
		void count(int from){
//			System.out.println("DEBUG val:"+val+" ID:"+id+" From:"+from);
			debugcnt++;
			for(R r:child)r.count(id);
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + id;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			R other = (R) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (id != other.id)
				return false;
			return true;
		}
		private Main getOuterType() {
			return Main.this;
		}
		
	}
	
	int cnt, max, c, ID, L = 12345678, debugcnt;
	R next;
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			ID = 0;
			R root = new R(ID++, n, null);
			int res = 1, T = 1;
			for(;;T++){
				root.nextVal();
				if(root.val==1)break;
				root.shrink();
				cnt = max = c = 0;
				next = null;
				root.findLeader();
				if(c==1){
					int k = (next.val+1)>>1;
					if((k&1)==0)k--;
					if(1<k){
//						System.out.println("Leader Bonus :"+k);
						cnt++;
						next.child.add(new R(ID++, k, next));
					}
					root = next;
					if(root.parent!=null){
						root.parent.rev(root);
						root.child.add(root.parent);
						root.parent = null;
						debugcnt = 0;
						root.count(root.id);
//						System.out.println("Reverse? "+cnt+" "+debugcnt);
					}
				}
//				System.out.println("T:"+T+" count:"+cnt+" Leader val:"+root.val);
				res = Math.max(res, cnt);
			}
			System.out.println(T+" "+res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}