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
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			int sum=0;
			for(int i=0; i<n; i++){
				int size=sc.nextInt()+sc.nextInt()+sc.nextInt();
				int w=sc.nextInt();
				int[] sizes={60, 80, 100, 120, 140, 160};
				int[] ws={2, 5, 10, 15, 20, 25};
				for(int k=0; k<6; k++){
					if(size<=sizes[k]&&w<=ws[k]){
						sum+=600+k*200;
						break;
					}
				}
			}
			println(""+sum);
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