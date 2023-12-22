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

	char[] s, key;

	void run(){
		for(;;){
			StringBuffer lines=new StringBuffer("");
			for(;;){
				String line=sc.nextLine();
				if(line.equals("")){
					break;
				}
				lines.append(line);
			}
			s=lines.toString().toCharArray();
			key=sc.nextLine().toCharArray();
			// solve();
			if(sc.hasNextLine()){
				sc.nextLine();
			}else{
				break;
			}
		}
		System.out.flush();
	}

	void solve(){
		int i=0, j=0;
		int num=0;
		int n=s.length;

		int min=INF;
		int cMin=0, iMin=0, jMin=0;

		int nKey=0;
		boolean[] isKey=new boolean[256];
		for(char c : key){
			isKey[c]=true;
		}
		for(boolean b : isKey){
			nKey+=b?1:0;
		}
		int[] count=new int[256];

		for(;;){
			for(; j<n&&num<nKey; j++){
				if(isKey[s[j]]&&count[s[j]]++==0){
					num++;
				}
			}

			if(num<nKey){
				break;
			}

			if(j-i<min){
				iMin=i;
				jMin=j;
				min=j-i;
				cMin=1;
			}else if(j-i==min){
				cMin++;
			}

			if(isKey[s[i]]&&--count[s[i]]==0){
				num--;
			}
			i++;
		}

		println(cMin+"\n");
		if(cMin>0){
			String ans=new String(s, iMin, jMin-iMin);
			for(int k=0; k<(ans.length()-1)/72+1; k++){
				println(ans.substring(k*72, min((k+1)*72, ans.length())));
			}
			println("");
		}
		// debug(cmin, first);
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
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}