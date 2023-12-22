import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Indian Puzzle
public class Main{

	class E implements Comparable<E>{
		String s;
		int count;
		char[][] str;
		public E(String s) {
			this.s = s;
			count = 0;
			for(char c:s.toCharArray())if(Character.isUpperCase(c))count++;
			str = new char[2][];
			String[] t = s.split("=");
			str[0] = (t[0]+"$").toCharArray();
			str[1] = (t[1]+"$").toCharArray();
		}
		public int compareTo(E o) {
			return count-o.count;
		}
	}
	
	int n;
	char[] cand;
	int[] ref;
	boolean[] u;
	List<E> exs;
	
	char[] s;
	int id;
	
	boolean sub(char[] t, int k, int ind){
		if(ind==t.length){
//			System.out.println("R[0]:" + r[0] + " R[1]:" + r[1]);
//			for(int i=0;i<n;i++){
//				if(ref[i]!=-1)System.out.println((char)(i+'A')+" -> " + cand[ref[i]]);
//			}
			id = 0;
			s = exs.get(k).str[0];
			double ex1 = exp();
			if(ex1==1<<28)return false;
			id = 0;
			s = exs.get(k).str[1];
			double ex2 = exp();
			if(ex2==1<<28)return false;
			if(Math.abs(ex1-ex2)<1e-6)return assign(k+1);
			return false;
		}
		if(!Character.isUpperCase(t[ind]))return sub(t,k,ind+1);
		int x = t[ind]-'A';
		if(ref[x]!=-1)return sub(t,k,ind+1);
		for(int i=0;i<n;i++){
			if(u[i])continue;
			u[i] = true;
			ref[x] = i;
			if(sub(t,k,ind+1))return true;
			u[i] = false;
			ref[x] = -1;
		}
		return false;
	}
	
	boolean assign(int k){
		if(k==exs.size())return true;
		return sub(exs.get(k).s.toCharArray(), k, 0);
	}
	
	char get(){
		if(Character.isUpperCase(s[id]))return cand[ref[s[id++]-'A']];
		else return s[id++];
	}
	
	double exp(){
		double res = fact();
		if(res==1<<28)return res;
		while(true){
			char c = get();
			if(c=='+'){
				double a = fact();
				if(a==1<<28)return a;
				res+=a;
			}
			else if(c=='-'){
				double a = fact();
				if(a==1<<28)return a;
				res-=a;
			}
			else break;
		}
		return res;
	}
	
	double fact(){
		double res = digit();
		if(res==1<<28)return res;
		while(true){
			char c = get();
			if(c=='*'){
				double a = digit();
				if(a==1<<28)return a;
				res*=a;
			}
			else if(c=='/'){
				double a = digit();
				if(a==1<<28||a==0)return a;
				res/=a;
			}
			else break;
		}
		id--;
		return res;
	}
	
	double digit(){
		double res = 0;
		char c = get();
		if(!Character.isDigit(c))return 1<<28;
		char next = get();
		if(c=='0'&&'1'<=next&&next<='9')return 1<<28;
		id--;
		while(Character.isDigit(c)){
			res = res*10 + (c-'0');
			c = get();
		}
		id--;
		return res;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if((h|w)==0)break;
			char[][] m = new char[h][w];
			for(int i=0;i<h;i++)m[i]=sc.next().toCharArray();
			int k = 0;
			for(int i=0;i<h;i++)for(int j=0;j<w;j++)if(m[i][j]=='.')m[i][j]=(char)(k+++'A');
			exs = new ArrayList<E>();
			for(int i=0;i<h;i++){
				for(int j=0;j<w-1;j++){
					if(m[i][j]!='#'&&m[i][j+1]!='#'){
						StringBuilder sb = new StringBuilder();
						while(j<w&&m[i][j]!='#'){
							sb.append(m[i][j++]);
						}
						exs.add(new E(sb.toString()));
					}
				}
			}
			for(int j=0;j<w;j++){
				for(int i=0;i<h-1;i++){
					if(m[i][j]!='#'&&m[i+1][j]!='#'){
						StringBuilder sb = new StringBuilder();
						while(i<h&&m[i][j]!='#'){
							sb.append(m[i++][j]);
						}
						exs.add(new E(sb.toString()));
					}
				}
			}
			Collections.sort(exs);
			n = sc.nextInt();
			cand = new char[n];
			for(int i=0;i<n;i++)cand[i]=sc.next().charAt(0);
			ref = new int[n];
			Arrays.fill(ref, -1);
			u = new boolean[n];
			System.out.println(assign(0)?"Yes":"No");
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}