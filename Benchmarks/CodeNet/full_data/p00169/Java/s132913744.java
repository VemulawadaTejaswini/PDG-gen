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

	LinkedList<Integer> list=new LinkedList<Integer>();

	void run(){
		for(;;){
			Scanner s=new Scanner(sc.nextLine());
			int count1=0;// 1ÌÂ
			int sum=0;
			for(; s.hasNext();){
				int a=s.nextInt();
				if(a==0){
					return;
				}
				if(a>10){
					sum+=10;
				}else{
					sum+=a;
				}
				if(a==1){
					count1++;
				}
			}
			int ans=0;
			for(int i=0; i<=count1; i++){
				if(sum<=21){
					ans=sum;
				}
				sum+=10;
			}
			println(""+ans);
		}
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