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

	String[] ss;

	void run(){
		ss=new String[3];
		for(;;){
			ss[0]=sc.next();
			if(ss[0].equals("0")){
				break;
			}
			ss[1]=sc.next();
			ss[2]=sc.next();
			solve();
		}
	}

	void solve(){
		for(int j=0; j<3; j++){
			int a=0, b=0;
			for(int i=0; i<ss[j].length()-1; i++){
				if(ss[j].charAt(i+1)=='A'){
					a++;
				}else{
					b++;
				}
			}
			// ツ催古」ツづ個暗ェツ点
			if(j<2){
				if(ss[j+1].charAt(0)=='A'){
					a++;
				}else{
					b++;
				}
			}else{
				if((a+1==11&&b<=9)||(a+1>=12&&a==b+2)){
					a++;
				}
				if((b+1==11&&a<=9)||(b+1>=12&&b==a+2)){
					b++;
				}
			}
			println(a+" "+b);
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