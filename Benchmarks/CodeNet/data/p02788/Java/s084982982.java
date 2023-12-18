// This file is a "Hello, world!" in Java language by OpenJDK for wandbox.

import java.util.*;
import java.io.*;

class Main
{
	public static void main(String[] args){
		new Main().run();
	}
	
	class State{
		long pos;
		long val;
		public State(long pos,long val){
			this.pos=pos;
			this.val=val;
		}		
	}
	
	void run(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long D=sc.nextLong();
		long A=sc.nextLong();
		long[][] Y=new long[N][2];
		for(int i=0;i<N;++i){
			Y[i][0]=sc.nextLong();
			Y[i][1]=sc.nextLong();
		}
		Arrays.sort(Y,new Comparator<long[]>(){
			public int compare(long[] a,long[] b){
				return Long.compare(a[0],b[0]);
			}
		});
		ArrayDeque<State> dq= new ArrayDeque<>();
		long sum=0;
		long ans=0;
		for(int i=0;i<N;++i){
			while(!dq.isEmpty()&&Y[i][0]>=dq.peekFirst().pos){
				sum-=dq.pollFirst().val;
			}
			Y[i][1]-=sum;
			if(Y[i][1]>0){
				long num=(Y[i][1]+A-1)/A;
				ans+=num;
				Y[i][1]-=A*num;
				sum+=A*num;
				dq.addLast(new State(Y[i][0]+2*D+1,A*num));
			}
		}
		System.out.println(ans);
	}
	
	void tr(Object...o){
		System.out.println(Arrays.deepToString(o));
	}

}

// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase
