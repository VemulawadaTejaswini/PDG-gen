import java.util.*;
import java.io.*;

// This file is a "Hello, world!" in Java language by OpenJDK for wandbox.

class Main
{
    public static void main(String[] args)
    {
        new Main().run();
    }

	void run(){
        Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String[] s=new String[N];
		int[] t=new int[N];
		for(int i=0;i<N;++i){
			s[i]=sc.next();
			t[i]=sc.nextInt();
		}
		String X=sc.next();
		for(int i=0;i<N;++i){
			if(X.equals(s[i])){
				long ans=0;
				for(int j=i+1;j<N;++j)ans+=t[j];
				System.out.println(ans);
				return;
			}
		}
		throw new AssertionError();
    }
	
	void tr(Object...o){
		System.out.println(Arrays.deepToString(o));
	}
}
// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase
