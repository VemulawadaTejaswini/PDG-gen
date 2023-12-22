import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.Math.*;

import java.util.*;


public class Main {

	public static Scanner sc=new Scanner(in);


	static boolean next_permutation(int[]as) {
		int n = as.length;
		for (int i = n - 1; i > 0; i--) {
			if (as[i - 1] < as[i]) {
				int j = n;
				while (as[i - 1] >= as[--j]);
				swap(as, i - 1, j);
				reverse(as, i, n);
				return true;
			}
		}
		return false;
	}
	static void swap(int[] is, int i, int j) {
		int t = is[i];
		is[i] = is[j];
		is[j] = t;
	}
	static void reverse(int[] is, int s, int t) {
		while (s < --t) swap(is, s++, t);
	}

	void run(){
		while(true){
			int _n=sc.nextInt();
			if(_n==0)return;
			List<String> slist=new ArrayList<String>();
			for(int i=0;i<_n;i++)slist.add(sc.next());

			List<String> rlist=new ArrayList<String>();
			for(int i=0;i<_n;i++){
				for(int j=0;j<_n;j++)if(i!=j){
					if(slist.get(i).contains(slist.get(j)))rlist.add(slist.get(j));
				}
			}
			slist.removeAll(rlist);
			int n=slist.size();
			String[] ss=slist.toArray(new String[0]);

			String[][] suffixes=new String[n][];
			for(int i=0;i<n;i++){
				suffixes[i]=new String[ss[i].length()+1];
				for(int l=0;l<=ss[i].length();l++)suffixes[i][l]=ss[i].substring(0,l);
			}
			int[][] dup=new int[n][n];
			for(int i=0;i<n;i++)for(int j=0;j<n;j++){
				sl:for(int l=ss[j].length()-1;l>=0;l--){
					if(ss[i].endsWith(suffixes[j][l])){
						dup[i][j]=l;
						break sl;
					}
				}
			}

			int[] per=new int[n];
			for(int i=0;i<n;i++)per[i]=i;

			String mins="";
			for(int i=0;i<200;i++)mins+="-";//INF length
			do{
				String tmp=new String();
				for(int i=0;i<n;i++){
					if(tmp.contains(ss[per[i]]))continue;
					if(i!=0)tmp+=ss[per[i]].substring(dup[per[i-1]][per[i]]);
					else tmp+=ss[per[i]];
				}
				if(mins.length()>tmp.length())mins=tmp;
				else if(mins.length()==tmp.length() && mins.compareTo(tmp)<0)mins=tmp;
			}while(next_permutation(per));

			ln(mins);
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

	//output lib
	public static void ln(){
		out.println();
	}
	public static void pr(Object obj){
		out.print(str(obj));
	}
	public static void ln(Object obj){
		pr(obj);ln();
	}
	public static String str(Object obj){
		return obj.toString();
	}
	public static <E> String str(E[] obj){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<obj.length;i++){
			sb.append(i==0?"":" ").append(obj[i]);
		}
		return sb.toString();
	}
	public static <E> String str(List<E> obj){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<obj.size();i++){
			sb.append(i==0?"":" ").append(obj.get(i));
		}
		return sb.toString();
	}


}