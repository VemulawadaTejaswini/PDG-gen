import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	void run(){
		for(;;){
			int q=sc.nextInt();
			int lim=sc.nextInt();
			if((q|lim)==0){
				return;
			}
			BIT bit=new BIT(q);
			HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
			int[] a=new int[q];

			for(int i=0; i<q; i++){
				int query=sc.nextInt();
				int x=sc.nextInt();
				if(query==0){
					// CLx[gµ½ÅÌÉ xi
					// ÌÔðèÄ½±Æð\·BCLx[g³ê½ÅÌÉÍxiÌÔªèÄçêéB
					map.put(x, i);
					bit.add(i, 1);
					a[i]=x;
					if(bit.sum(0, q)>lim){
						int k=bit.get(0);
						bit.add(k, -1);
					}
				}else if(query==1){
					// zñÌ xi ÔÚÌÔª¦·ÂÌð~ÂÌÉ±­B
					int k=bit.get(x-1);
					bit.add(k, -1);
				}else if(query==2){
					// »Ì_ÅzñÉÜÜêÄ¢éÅ@xi@ÔÚÌÅÌÌÔðoÍ·é
					int k=bit.get(x-1);
					println(a[k]+"");
				}else if(query==3){
					// Ôª xi ÌÅÌð~ÂÌÉ±­
					int k=map.get(x);
					bit.add(k, -1);
				}
			}
			println("end");
		}
	}

	class BIT{
		int[] vs;

		BIT(int n){
			vs=new int[n+1];
		}

		void add(int k, int a){
			for(int i=k+1; i<vs.length; i+=i&-i){
				vs[i]+=a;
			}
		}

		int sum(int s, int t){
			if(s>0)
				return sum(0, t)-sum(0, s);
			int res=0;
			for(int i=t; i>0; i-=i&-i){
				res+=vs[i];
			}
			return res;
		}

		// [0,i] Ìaªk æèå«­ÈéÅ¬Ìi ðßé
		int get(int k){
			int p=Integer.highestOneBit(vs.length-1);
			for(int q=p; q>0; q>>=1, p|=q){
				if(p>=vs.length||k<vs[p])
					p^=q;
				else
					k-=vs[p];
			}
			return p;
		}
	}

	void debug(Object... os){
		// System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}