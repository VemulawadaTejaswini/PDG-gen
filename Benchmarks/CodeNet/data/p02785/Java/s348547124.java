// This file is a "Hello, world!" in Java language by OpenJDK for wandbox.

import java.util.*;
import java.io.*;

class Main
{
	public static void main(String[] args){
		new Main().run();
	}
	
	void run(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		long[] H=new long[N];
		for(int i=0;i<N;++i)H[i]=sc.nextLong();
		Arrays.sort(H);
		long ans=0;
		for(int i=0;i<N-K;++i)ans+=H[i];
		System.out.println(ans);
	}
}

// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase
