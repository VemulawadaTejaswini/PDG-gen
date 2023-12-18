import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Relation> atoa = new ArrayList<>();
		ArrayList<Relation> btob = new ArrayList<>();
		ArrayList<Relation> atob = new ArrayList<>();

		int N = sc.nextInt();
		int M = sc.nextInt();
		boolean ar[] = new boolean[N];
		String st = sc.next();
		boolean flag = false;

		for(int n=0;n<N;n++){
			if(st.charAt(n) == 'A') ar[n] = true;
			else ar[n] = false;
		}

		for(int m=0;m<M;m++){
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			Relation re = new Relation(x,y);
			if(ar[x] == ar[y]){
				if(ar[x]) atoa.add(re);
				else btob.add(re);
			}
			else atob.add(re);
		}

		outside:for(int aa=0;aa<atoa.size();aa++){
			for(int bb=0;bb<btob.size();bb++){
				int an = atoa.get(aa).n;
				int am = atoa.get(aa).m;
				int bn = btob.get(bb).n;
				int bm = btob.get(bb).m;

				boolean atobnn,atobnm,atobmn,atobmm;
				if(atob.indexOf(new Relation(an,bn)) != -1) atobnn = true;
				else atobnn = false;

				if(atob.indexOf(new Relation(an,bm)) != -1) atobnm = true;
				else atobnm = false;

				if(atob.indexOf(new Relation(am,bn)) != -1) atobmn= true;
				else atobmn = false;

				if(atob.indexOf(new Relation(am,bm)) != -1) atobmm = true;
				else atobmm = false;

				if(an == am){
					if(bn == bm){
						if(atobnn){
						 	flag = true;
						 	break outside;
						}
					}else{
						if(atobnn && atobnm){
						 	flag = true;
						 	break outside;
						}
					}
				}else{
					if(bn == bm){
						if(atobnn && atobmn){
						 	flag = true;
						 	break outside;
						}
					}else{
						if((atobnn && atobmm) ||
							(atobnm && atobmn)){
						 	flag = true;
						 	break outside;
						}

					}
				}
			}
		}

		if(flag) System.out.println("Yes");
		else System.out.println("No");

	}

	public static class Relation{
		int n,m;
		Relation(int n,int m){
			if(n<=m){
				this.n = n;
				this.m = m;
			}else{
				this.n = m;
				this.m = n;
			}
		}

		public boolean equals(Object obj){
		    Relation t = (Relation)obj;
	    	int tn = t.n;
	    	int tm = t.m;

			if(n==tn && m==tm) return true;
			else return false;
		}
	}
}