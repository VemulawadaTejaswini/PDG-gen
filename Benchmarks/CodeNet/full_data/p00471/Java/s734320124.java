import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	private static final Scanner S=new Scanner(System.in);
	private static final PrintStream O=System.out;
	
	private static class State {
		private static final int H=1,K=2,Z=3;
		private static final int U=0,D=1,L=2,R=3;

		private final int is,js,t[][];
		
		private State(final int is, final int js, final int[][] t) {
			this.is=is;
			this.js=js;
			this.t=t.clone();
			for(int i=0;i<t.length;i++) this.t[i]=t[i].clone();
		}
		
		private boolean b(final int d, State ps[], int n) {
			if(d==U) {
				int pis;
				for(pis=is;t[pis][js]!=H;pis--) if(pis<=0) return false;
				ps[n]=new State(pis,js,t);
				ps[n].t[pis][js]=Z;
				return true;
			}
			if(d==D) {
				int pis;
				for(pis=is;t[pis][js]!=H;pis++) if(pis>=t.length-1) return false;
				ps[n]=new State(pis,js,t);
				ps[n].t[pis][js]=Z;
				return true;
			}
			if(d==L) {
				int pjs;
				for(pjs=js;t[is][pjs]!=H;pjs--) if(pjs<=0) return false;
				ps[n]=new State(is,pjs,t);
				ps[n].t[is][pjs]=Z;
				return true;
			}
			if(d==R) {
				int pjs;
				for(pjs=js;t[is][pjs]!=H;pjs++) if(pjs>=t[is].length-1) return false;
				ps[n]=new State(is,pjs,t);
				ps[n].t[is][pjs]=Z;
				return true;
			}
			return false;
		}
		
		private boolean r(final int d) {
			if(d==U) {
				for(int pis=is;t[pis][js]!=K;pis--) if(pis<=0) return false;
				return true;
			}
			if(d==D) {
				for(int pis=is;t[pis][js]!=K;pis++) if(pis>=t.length-1) return false;
				return true;
			}
			if(d==L) {
				for(int pjs=js;t[is][pjs]!=K;pjs--) if(pjs<=0) return false;
				return true;
			}
			if(d==R) {
				for(int pjs=js;t[is][pjs]!=K;pjs++) if(pjs>=t[is].length-1) return false;
				return true;
			}
			return false;
		}
	}
	
	public static void main(String[] args) {
		int m,n;
		while((m=S.nextInt())!=0 && (n=S.nextInt())!=0) {
			int is=0,js=0,t[][]=new int[n][m],nh=0;
			for(int i=0;i<n;i++) for(int j=0;j<m;j++) {
				t[i][j]=S.nextInt();
				if(t[i][j]==State.K) {
					is=i;
					js=j;
				} else if(t[i][j]==State.H) nh++;
			}
			int nc=1;
			State cs[]=new State[nc];
			cs[0]=new State(is, js, t);
			int ca[]=new int[cs.length];
			ca[0]=1;
			for(int i=0;i<nh;i++) {
				int np=0;
				State ps[]=new State[nc*4];
				int pa[]=new int[ps.length];
				for(int j=0;j<nc;j++) for(int k=0;k<4;k++) if(cs[j].b(k, ps, np)) {
					int l;
					for(l=0;l<np;l++) if(ps[np].equals(ps[l])) {
						pa[l]+=ca[j];
						break;
					}
					if(l>=np) {
						pa[np]=ca[j];
						np++;
					}
				}
				nc=np;
				cs=ps;
				ca=pa;
			}
			int a=0;
			for(int i=0;i<nc;i++) for(int j=0;j<4;j++) if(cs[i].r(j)) a+=ca[i];
			O.println(a);
		}
	}
}