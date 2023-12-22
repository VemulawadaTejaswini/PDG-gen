import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Princess, a Cryptanalyst
// 2013/05/22
public class Main{
	Scanner sc=new Scanner(System.in);

	HashSet<String> set;

	void run(){
		for(;;){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			set=new HashSet<String>();
			for(int i=0; i<n; i++){
				set.add(sc.next());
			}
			solve();
		}
	}

	String[] ss;
	int n;

	void solve(){
		for(;;){
			String remove=null;
			for(String s : set){
				for(String t : set){
					if(!t.equals(s)&&t.indexOf(s)>=0){
						remove=s;
					}
				}
			}
			if(remove!=null){
				set.remove(remove);
			}else{
				break;
			}
		}
		ss=set.toArray(new String[0]);
		n=ss.length;
		M=new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				for(int k=0; k<ss[j].length(); k++){
					if(ss[i].endsWith(ss[j].substring(0, k))){
						M[i][j]=k;
					}
				}
			}
		}
		now=new char[200];
		ans=null;
		rec(0, -1, 0);
		println(new String(ans).substring(0, length(ans)));
	}

	int[][] M;
	char[] now, ans;

	void rec(int length, int last, int used){
		if(used==(1<<n)-1){
			if(ans==null||length(now)<length(ans)
					||(length(now)==length(ans)&&compare(now, ans)<0)){
				ans=now.clone();
			}
		}
		for(int i=0; i<n; i++){
			if((used>>i&1)==0){
				if(last==-1){
					add(now, length, ss[i], 0, ss[i].length());
					rec(ss[i].length(), i, used|(1<<i));
					remove(now, 0, ss[i].length());
				}else{
					add(now, length, ss[i], M[last][i], ss[i].length());
					int delta=ss[i].length()-M[last][i];
					rec(length+delta, i, used|(1<<i));
					remove(now, length, length+delta);
				}
			}
		}
	}

	void add(char[] cs, int from, String s, int from1, int to1){
		for(int i=from1; i<to1; i++){
			cs[from+(i-from1)]=s.charAt(i);
		}
	}

	void remove(char[] cs, int from, int to){
		for(int i=from; i<to; i++){
			cs[i]=0;
		}
	}

	int length(char[] cs){
		for(int i=0; i<cs.length; i++){
			if(cs[i]==0){
				return i;
			}
		}
		return cs.length;
	}

	int compare(char[] c1, char[] c2){
		for(int i=0; i<min(c1.length, c2.length); i++){
			if(c1[i]!=c2[i]){
				return c1[i]-c2[i];
			}
		}
		return Integer.signum(c1.length-c2.length);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}