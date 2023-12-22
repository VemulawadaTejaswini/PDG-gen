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

	// I-1
	// V-5
	// X-10
	// L-50
	// C-100
	// D-500
	// M-100
	// Iツづ個古」V,X
	// Xツづ個古」L,C

	void run(){
		for(; sc.hasNext();){
			String s=sc.next();
			int ans=0;
			for(int i=0; i<s.length(); i++){
				if(s.charAt(i)=='I'){
					if(i<s.length()-1&&s.charAt(i+1)=='V'){
						ans+=4;
						i++;
					}else if(i<s.length()-1&&s.charAt(i+1)=='X'){
						ans+=9;
						i++;
					}else{
						ans+=1;
					}
				}else if(s.charAt(i)=='V'){
					ans+=5;
				}else if(s.charAt(i)=='X'){
					if(i<s.length()-1&&s.charAt(i+1)=='L'){
						ans+=40;
						i++;
					}else if(i<s.length()-1&&s.charAt(i+1)=='C'){
						ans+=90;
						i++;
					}else{
						ans+=10;
					}
				}else if(s.charAt(i)=='L'){
					ans+=50;
				}else if(s.charAt(i)=='C'){
					if(i<s.length()-1&&s.charAt(i+1)=='D'){
						ans+=400;
						i++;
					}else if(i<s.length()-1&&s.charAt(i+1)=='M'){
						ans+=900;
						i++;
					}else{
						ans+=100;
					}
				}else if(s.charAt(i)=='D'){
					ans+=500;
				}else if(s.charAt(i)=='M'){
					ans+=1000;
				}
				// debug(ans);
			}
			// debug();
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