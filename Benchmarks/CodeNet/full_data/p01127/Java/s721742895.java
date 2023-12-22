
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

import static java.lang.System.*;

class Main {
	public static Random rand=new Random();

	public void run() {
		int n=sc.nextInt();
		while(n--!=0){
			int H=sc.nextInt(),W=sc.nextInt();
			char[][] map=new char[H][W];
			for(int i=0;i<H;i++)map[i]=sc.next().toCharArray();

			//長方形が見つかれば、除いていく。

			int M=7;
			Find:while(M--!=0){
				for(int h=0;h<H;h++)for(int w=0;w<W;w++){
					if(Character.isUpperCase(map[h][w])){
						char v=map[h][w];
						int wd=0;
						while(w+wd<W && map[h][w+wd]==v)wd++;
						int hd=0;
						while(h+hd<H && map[h+hd][w]==v)hd++;
						boolean isRect=true;
						for(int _h=h;_h<h+hd;_h++)for(int _w=w;_w<w+wd;_w++)
							if(map[_h][_w]!=v && map[_h][_w]!='_')isRect=false;
						if(isRect){
							for(int _h=h;_h<h+hd;_h++)for(int _w=w;_w<w+wd;_w++){
								map[_h][_w]='_';
							}
							continue Find;
						}
					}
				}
			}

			boolean isSafe=true;
			for(int h=0;h<H;h++)for(int w=0;w<W;w++){
				if(!(map[h][w]=='_' || map[h][w]=='.'))isSafe=false;
			}
			ln(isSafe?"SAFE":"SUSPICIOUS");
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