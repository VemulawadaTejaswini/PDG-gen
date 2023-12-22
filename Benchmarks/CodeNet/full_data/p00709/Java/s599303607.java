import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int m, n;
	int[][] a;

	void run(){
		for(;;){
			m=sc.nextInt();
			n=sc.nextInt();
			if((m|n)==0){
				break;
			}
			a=new int[n][m];
			for(int j=0; j<n; j++){
				for(int i=0; i<m; i++){
					a[j][i]=sc.nextInt();
				}
			}
			solve();
		}
	}

	void solve(){
		ArrayList<BitSet> candidate=new ArrayList<BitSet>();

		for(int y=0; y<n; y++){
			for(int x=0; x<m; x++){
				for(int s=1; x+s<=m&&y+s<=n; s++){
					boolean all1=true;
					BitSet bs=new BitSet();
					for(int j=y; j<y+s; j++){
						for(int i=x; i<x+s; i++){
							all1&=a[j][i]==1;
							bs.set(j*m+i);
						}
					}
					if(all1){
						candidate.add(bs);
					}
				}
			}
		}

		boolean[] use=new boolean[candidate.size()];
		BitSet[] bss=candidate.toArray(new BitSet[0]);
		fill(use, true);

		int ans=0;
		for(;;){
			boolean update=false;

			for(int j=0; j<bss.length; j++){
				if(!use[j]){
					continue;
				}
				for(int i=0; i<bss.length; i++){
					if(!use[i]||i==j){
						continue;
					}
					BitSet bs=(BitSet)bss[j].clone();
					bs.and(bss[i]);
					if(bs.equals(bss[j])){
						use[j]=false;
						update=true;
					}
				}
			}

			for(int b=0; b<m*n; b++){
				ArrayList<Integer> list=new ArrayList<Integer>();
				for(int i=0; i<bss.length; i++){
					if(use[i]&&bss[i].get(b)){
						list.add(i);
					}
				}
				if(list.size()==1){
					ans++;
					int k=list.get(0);
					use[k]=false;
					for(int j=0; j<n; j++){
						for(int i=0; i<m; i++){
							if(bss[k].get(j*m+i)){
								a[j][i]=0;
							}
						}
					}
					for(int i=0; i<bss.length; i++){
						if(use[i]){
							bss[i].andNot(bss[k]);
						}
					}
					update=true;
				}
			}
			if(!update){
				break;
			}
		}

		BitSet all=new BitSet();
		for(int j=0; j<n; j++){
			for(int i=0; i<m; i++){
				if(a[j][i]==1){
					all.set(j*m+i);
				}
			}
		}

		HashSet<BitSet> set=new HashSet<BitSet>();
		set.add(all);
		for(int i=0; i<bss.length; i++){
			if(!use[i]){
				continue;
			}
			HashSet<BitSet> set2=new HashSet<BitSet>();
			for(BitSet bs : set){
				BitSet bs1=(BitSet)bs.clone();
				bs1.and(bss[i]);
				BitSet bs2=(BitSet)bs.clone();
				bs2.xor(bs1);
				set2.add(bs1);
				set2.add(bs2);
			}
			set=set2;
		}
		set.remove(new BitSet());
		BitSet[] compress=set.toArray(new BitSet[0]);

		// 包除原理によるk-Cover

		int v=compress.length;
		int[] a=new int[1<<v];
		for(int j=0; j<bss.length; j++){
			if(!use[j]){
				continue;
			}
			int bit=0;
			for(int i=0; i<v; i++){
				if(bss[j].intersects(compress[i])){
					bit|=1<<i;
				}
			}
			a[bit]=1;
		}

		zeta(a, v);

		int left=0, right=n;
		if(kCover(0, a, v)){
			right=0;
		}else{
			for(; left+1<right;){
				int mid=(left+right)/2;
				if(kCover(mid, a, v))
					right=mid;
				else
					left=mid;
			}
		}
		ans+=right;
		println(ans+"");
	}

	void zeta(int[] a, int v){
		for(int i=0; i<v; i++)
			for(int s=0; s<1<<v; s++)
				if((s>>i&1)==1)
					a[s]+=a[s^(1<<i)];
	}

	int pow(int x, int k){
		if(k==0)
			return 1;
		else if((k&1)==0)
			return pow(x*x, k>>>1);
		else
			return x*pow(x, k-1);
	}

	boolean kCover(int k, int[] f, int n){
		int g=0;
		for(int i=0; i<1<<n; i++)
			if(Integer.bitCount(((1<<n)-1)^i)%2==0)
				g+=pow(f[i], k);
			else
				g-=pow(f[i], k);
		return g!=0;
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
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