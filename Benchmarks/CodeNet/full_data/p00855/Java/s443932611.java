import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	void run(){
		boolean[] p=new boolean[2000000];
		Arrays.fill(p, true);
		p[0]=p[1]=false;
		for(int i=2; i<p.length; i++){
			if(p[i]){
				for(int j=i*2; j<p.length; j+=i){
					p[j]=false;
				}
			}
		}
		for(;;){
			int m=sc.nextInt();
			if(m==0){
				break;
			}
			int ans=0;
			for(int i=m; i>=0&&!p[i]; i--){
				ans++;
			}
			for(int i=m; i<p.length&&!p[i]; i++){
				ans++;
			}
			println(""+ans);
		}
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