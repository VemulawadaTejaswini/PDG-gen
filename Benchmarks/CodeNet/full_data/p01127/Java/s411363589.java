import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

import static java.lang.System.*;
import static java.lang.Math.*;

class Main {
	public static Random rand=new Random();

	static boolean next_permutation(int[]as) {//早い
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

	public void run() {
		int n=sc.nextInt();
		Case:while(n--!=0){
			int H=sc.nextInt(),W=sc.nextInt();
			char[][] map=new char[H][W];
			for(int i=0;i<H;i++)map[i]=sc.next().toCharArray();

			//全探索
			Set<Character> keys=new HashSet<Character>();
			for(int h=0;h<H;h++)for(int w=0;w<W;w++){
				if(Character.isUpperCase(map[h][w])){
					keys.add(map[h][w]);
				}
			}
			int N=keys.size();
			int[] p=new int[N];for(int i=0;i<N;i++)p[i]=i;

			checking:do{
				Set<Character> usechar=new HashSet<Character>();
				//check
				for(char key:keys){
					usechar.add(key);
					int wmin=Integer.MAX_VALUE,hmin=Integer.MAX_VALUE,
					wmax=0,hmax=0;
					for(int _h=0;_h<H;_h++)for(int _w=0;_w<W;_w++){
						if(map[_h][_w]==key){
							wmin=min(_w,wmin);
							wmax=max(_w,wmax);
							hmin=min(_h,hmin);
							hmax=max(_h,hmax);
						}
					}
	                //rectangle check
	                boolean isRect=true;
	                for(int _h=hmin;_h<=hmax;_h++)for(int _w=wmin;_w<=wmax;_w++){
	                	 if(!usechar.contains(map[_h][_w]))isRect=false;
	                }
	                 if(!isRect)continue checking;
				}
				//
				ln("SAFE");continue Case;
			}while(next_permutation(p));
			ln("SUSPICIOUS");
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
	// from this
//		static BufferedReader in;
//		static PrintWriter out;
//		static {
//	    	try {
//				in =new BufferedReader(new FileReader("file.in")); Project/file.in
//				out=new PrintWriter(new BufferedWriter(new FileWriter("file.out")));
//	    	} catch (IOException e) {
//				e.printStackTrace();
//			}
	//  }
	// end

	static Scanner sc=new Scanner(in);


	//output lib
	static final String br=System.getProperty("line.separator");
	static final String[] asep=new String[]{""," ",br,br+br};
	static String str(boolean o){
		return o?"YES":"NO";
	}
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
		return o.toString();
	}
	static int _getArrayDepth(Object o){
		if(!o.getClass().isArray() || Array.getLength(o)==0) return 0;
		return 	1+_getArrayDepth(Array.get(o,0));
	}
	//depth ex A[10]…1 A[10][10]…2 exception A[0]…0 A[10][0]…1 A[0][0]…0
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