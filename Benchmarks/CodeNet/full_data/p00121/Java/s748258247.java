import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int[] tmp = new int[8];
			for(int i=0;i<8;i++){
				if(!sc.hasNextInt()) return;
				tmp[i] = sc.nextInt();
			}

			Pazzle p = new Pazzle(tmp,0);
			int ans = Integer.MAX_VALUE;
			Queue<Pazzle> open = new LinkedList<Pazzle>();
			HashSet<Pazzle> closed = new HashSet<Pazzle>();
			open.add(p);

			while(!open.isEmpty()){
				Pazzle st = open.poll();
				if(closed.contains(st)) continue;
				closed.add(st);

				if(st.isAns()){
					ans = st.cost;
					break;
				}

				open.addAll(st.nexts());
			}

			System.out.println(ans);
		}
	}
}

class Pazzle{
	int[] p;
	int cost;

	Pazzle(int[] p,int cost){
		this.cost = cost;
		this.p = new int[8];
		for(int i=0;i<8;i++){
			this.p[i] = p[i];
		}
	}

	boolean isAns(){
		for(int i=0;i<8;i++){
			if(p[i] != i) return false;
		}
		return true;
	}

	List<Pazzle> nexts(){
		List<Pazzle> sts = new ArrayList<Pazzle>();

		int pos0 = -1;
		for(pos0=0;p[pos0]!=0;pos0++);

		Pazzle tmp = this.copy();
		if(pos0 - 4 >= 0){
			tmp.p[pos0] ^= tmp.p[pos0-4];
			tmp.p[pos0-4] ^= tmp.p[pos0];
			tmp.p[pos0] ^= tmp.p[pos0-4];
		}
		tmp.cost++;
		sts.add(tmp);

		tmp = this.copy();
		if(pos0 + 4 < 8){
			tmp.p[pos0] ^= tmp.p[pos0+4];
			tmp.p[pos0+4] ^= tmp.p[pos0];
			tmp.p[pos0] ^= tmp.p[pos0+4];
		}
		tmp.cost++;
		sts.add(tmp);

		tmp = this.copy();
		if(pos0%4<3 && pos0+1>=0){
			tmp.p[pos0] ^= tmp.p[pos0+1];
			tmp.p[pos0+1] ^= tmp.p[pos0];
			tmp.p[pos0] ^= tmp.p[pos0+1];
		}
		tmp.cost++;
		sts.add(tmp);

		tmp = this.copy();
		if(pos0%4>0 && pos0-1>=0){
			tmp.p[pos0] ^= tmp.p[pos0-1];
			tmp.p[pos0-1] ^= tmp.p[pos0];
			tmp.p[pos0] ^= tmp.p[pos0-1];
		}
		tmp.cost++;
		sts.add(tmp);

		return sts;
	}

	public boolean equals(Object o){
		Pazzle tmp = (Pazzle)o;
		for(int i=0;i<8;i++){
			if(tmp.p[i] != this.p[i]) return false;
		}
		return true;
	}

	public int hashCode(){
		int res = 0;
		for(int i=0;i<8;i++) res += p[i] * Math.pow(10,i);
		return res;
	}

	Pazzle copy(){
		int[] tmp = new int[8];
		for(int i=0;i<8;i++){
			tmp[i] = this.p[i];
		}
		return new Pazzle(tmp,this.cost);
	}
}