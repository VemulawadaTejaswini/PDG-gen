import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.Math.*;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;


public class Main {

	public static Scanner sc=new Scanner(in);

	static int INF=1<<30;
	void run(){
		while(true){
			int n=sc.nextInt(),hx=sc.nextInt(),hy=sc.nextInt(),dx=sc.nextInt(),dy=sc.nextInt();
			if(n==0)return;

			int[] cxs=new int[n+1],cys=new int[n+1];
			cxs[0]=hx;cys[0]=hy;
			for(int i=1;i<n+1;i++){
				cxs[i]=sc.nextInt();
				cys[i]=sc.nextInt();
			}
			int[][] dist=new int[n+1][n+1];
			for(int i=0;i<n+1;i++)for(int j=0;j<n+1;j++){
				dist[i][j]=abs(cxs[i]-cxs[j])+abs(cys[i]-cys[j]);
			}
			int[] dmax=new int[n+1];
			for(int i=0;i<n+1;i++)
				dmax[i]=abs(cxs[i]-dx)+abs(cys[i]-dy);

			int[][] dp=new int[n+1][1<<(1+n)];//pos
			for(int j=0;j<n+1;j++)Arrays.fill(dp[j],INF);
			for(int j=0;j<n+1;j++){
				dp[j][0]=0;
				for(int i=0;i<(1<<(1+n));i++){
					if((dp[j][i]& 1)==1)dp[j][i]=0;
				}
			}
			for(int j=0;j<n+1;j++)dp[j][(1<<j)]=dist[0][j];
			for(int i=0;i<(1<<(1+n));i++){
				for(int next=0;next<n+1;next++){
					int mv=dp[next][i];
					if(((i>>next) & 1)==0)continue;
					for(int prev=0;prev<n+1;prev++){
						if(((i>>prev) & 1)==0)continue;
						if(next==prev)continue;
						if(mv>dp[prev][(i-(1<<next))]+dist[prev][next])
							mv=dp[prev][(i-(1<<next))]+dist[prev][next];
					}
					if(mv>=dmax[next])mv=INF;
					dp[next][i]=mv;
				}
			}

			int mv=INF;
			for(int i=0;i<n+1;i++){
				if(mv>dp[i][1<<(n+1)-1])
					mv=dp[i][1<<(n+1)-1];
			}
			ln(str(mv!=INF));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	//output lib
	static final String br=System.getProperty("line.separator");
	static final String[] asep=new String[]{""," ",br,br+br};
	static String str(Boolean o){
		return o?"YES":"NO";
	}
//	static String str(Double o){
//		return String.format("%.8f",o);
//	}
	static <K,V> String str(Map<K, V> map){
		StringBuilder sb=new StringBuilder();
		boolean isFirst=true;
		for(Entry<K,V> set:map.entrySet()){
			if(!isFirst)sb.append(br);
			sb.append(str(set.getKey())).append(":").append(str(set.getValue()));
			isFirst=false;
		}
		return sb.toString();
	}
	static <E> String str(Collection<E> list){
		StringBuilder sb=new StringBuilder();
		boolean isFirst=true;
		for(E e:list){
			if(!isFirst)sb.append(" ");
			sb.append(str(e));
			isFirst=false;
		}
		return sb.toString();
	}

	static String str(Object o){
		int depth=_getArrayDepth(o);
		if(depth>0)return _strArray(o,depth);
		Class<?> c=o.getClass();
		if(c.equals(Boolean.class))return str((Boolean)o);
		//if(c.equals(Double.class))return str((Double)o);

		return o.toString();
	}
	static int _getArrayDepth(Object o){
		if(!o.getClass().isArray() || Array.getLength(o)==0) return 0;
		return 	1+_getArrayDepth(Array.get(o,0));
	}
	static String _strArray(Object o,int depth){
		if(depth==0) return str(o);
		StringBuilder sb=new StringBuilder();
		for(int i=0,len=Array.getLength(o);i<len;i++){
			if(i!=0)sb.append(asep[depth]);
			sb.append(_strArray(Array.get(o,i),depth-1));
		}
		return sb.toString();
	}
	static void pr(Object... os){
		boolean isFirst=true;
		for(Object o:os){
			if(!isFirst)out.print(" ");
			out.print(o);
			isFirst=false;
		}
	}
	static void ln(){
		out.println();
	}
	static void ln(Object... os){
		for(Object o:os){
			pr(o);ln();
		}
	}
}