import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Seishun 18 Kippu 2013
// 2013/09/10
public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	void run(){
		int n=sc.nextInt(), t=sc.nextInt();
		sc.next();
		sc.next();
		int count=0;
		String line="";
		for(int i=0; i<n-1; i++){
			int time1=f(sc.next());
			String name=sc.next();
			int time2=f(sc.next());
			sc.next();
			if(time2-time1>=t){
				line+=name+" "+(time2-time1)+"\n";
				count++;
			}
		}
		line=count+"\n"+line;
		print(line);
	}

	int f(String s){
		return Integer.parseInt(s.substring(0, 2))*60
				+Integer.parseInt(s.substring(3, 5));
	}

	void solve(){

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
		new Main().run();
	}
}