import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc;

	static final int INF=1<<28;
	static final double EPS=1e-9;

	class N{
		long d;
		long r;

		N(long d, long r){
			this.d=d;
			this.r=r;
		}

		@Override
		public boolean equals(Object o){
			return ((N)o).r==r;
		}
	}

	void run(){
		sc=new Scanner(System.in);
		for(; sc.hasNext();){
			long p=sc.nextLong()*10;
			long q=sc.nextLong();
			LinkedList<N> list=new LinkedList<N>();
			N n0=null;
			long r=-1;
			for(int i=0; i<50; i++){
				// print((p/q)+"");
				n0=new N(p/q, r);
				if(list.contains(n0))
					break;
				list.add(n0);
				r=p%q;
				p=(p*10)%(q*10);
			}
/*			println("n0");
			println(n0.d+", "+n0.r);
			for(N n : list){
				println(n.d+", "+n.r);
			}
			println("");*/
			// n0.rª0¾Á½çLÀ
			if(n0.r==0){
				for(N n : list){
					if(n.r==0)
						break;
					print(n.d+"");
				}
				println("");
			}else{
				for(N n : list)
					print(n.d+"");
				println("");
				boolean f=false;
				for(N n : list){
					if(n.r==n0.r)
						f=true;
					print(f?"^":" ");
				}
				println("");
			}
		}
		sc.close();
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}