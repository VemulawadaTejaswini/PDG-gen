import static java.lang.System.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;

class Main {
    public static Scanner sc = new Scanner(in);
    public static Random rand=new Random();

    class IndD{
    	int r,s,c;
    	int indent;

    	public IndD(int _r,int _s,int _c,int _indent) {
    		r=_r;s=_s;c=_c;indent=_indent;
    	}
    }

    class Res{
    	int r,s,c;

    	public Res(int _r,int _s,int _c) {
    		r=_r;s=_s;c=_c;
    	}
    }

    public void run() {
    	while(true){
    		int p=sc.nextInt(),q=sc.nextInt();
	    	if(p==0 && q==0)return;


	    	IndD[] ps=new IndD[p];
    		int r=0,c=0,s=0;
	    	for(int i=0;i<p;i++){
	    		String str=sc.next();

	    		int indent=0;
	    		for(int j=0;j<str.length();j++){
	    			if(str.charAt(j)=='.')indent++;
	    			else break;
	    		}

	    		ps[i]=new IndD(r,s,c, indent);

	    		for(char ca :str.toCharArray()){
	    			if(ca=='(')r++;
	    			if(ca==')')r--;
	    			if(ca=='[')s++;
	    			if(ca==']')s--;
	    			if(ca=='{')c++;
	    			if(ca=='}')c--;
	    		}
	    	}

	    	IndD[] qs=new IndD[q];
    		r=c=s=0;
	    	for(int i=0;i<q;i++){
	    		String str=sc.next();
	    		int indent=0;
	    		for(int j=0;j<str.length();j++){
	    			if(str.charAt(j)=='.')indent++;
	    			else break;
	    		}
	    		qs[i]=new IndD(r,s,c, indent);
	    		for(char ca :str.toCharArray()){
	    			if(ca=='(')r++;
	    			if(ca==')')r--;
	    			if(ca=='[')s++;
	    			if(ca==']')s--;
	    			if(ca=='{')c++;
	    			if(ca=='}')c--;
	    		}
	    	}


	    	List<Res> reslist=new ArrayList<Res>();

	    	for(int R=1;R<=20;R++)for(int C=1;C<=20;C++)for(int S=1;S<=20;S++){
	    		boolean ok=true;
	    		for(int i=0;i<p;i++){
	    			if(R*ps[i].r+C*ps[i].c+S*ps[i].s==ps[i].indent){
	    			}else ok=false;
	    		}
	    		if(ok)reslist.add(new Res(R,S,C));

	    	}

	    	boolean isF=true;
	    	for(IndD qd:qs){
	    		int ind=-2;
	    		for(Res res:reslist){
	    			if(ind==-2)ind=res.c*qd.c+res.s*qd.s+res.r*qd.r;

	    			if(ind!=res.c*qd.c+res.s*qd.s+res.r*qd.r){
	    				ind=-1;break;
	    			}
	    		}

	    		if(ind<0){
	    			pr((isF?"":" ")+(-1));
	    		}else{
	    			pr((isF?"":" ")+ind);
	    		}

	    		isF=false;
	    	}
	    	ln();
    	}
    }
    public static void main(String[] args) {
        new Main().run();
    }


	//output lib
	static final String br = System.getProperty("line.separator");
	static final String[] asep = new String[] { "", " ", br, br + br };

	static String str(Boolean o) {
		return o ? "YES" : "NO";
	}

	//	static String str(Double o){
	//		return String.format("%.8f",o);
	//	}
	static <K, V> String str(Map<K, V> map) {
		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		for (Entry<K, V> set : map.entrySet()) {
			if (!isFirst)
				sb.append(br);
			sb.append(str(set.getKey())).append(":").append(str(set.getValue()));
			isFirst = false;
		}
		return sb.toString();
	}

	static <E> String str(Collection<E> list) {
		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		for (E e : list) {
			if (!isFirst)
				sb.append(" ");
			sb.append(str(e));
			isFirst = false;
		}
		return sb.toString();
	}

	static String str(Object o) {
		int depth = _getArrayDepth(o);
		if (depth > 0)
			return _strArray(o, depth);
		Class<?> c = o.getClass();
		if (c.equals(Boolean.class))
			return str((Boolean) o);
		//if(c.equals(Double.class))return str((Double)o);

		return o.toString();
	}

	static int _getArrayDepth(Object o) {
		if (!o.getClass().isArray() || Array.getLength(o) == 0)
			return 0;
		return 1 + _getArrayDepth(Array.get(o, 0));
	}

	static String _strArray(Object o, int depth) {
		if (depth == 0)
			return str(o);
		StringBuilder sb = new StringBuilder();
		for (int i = 0, len = Array.getLength(o); i < len; i++) {
			if (i != 0)
				sb.append(asep[depth]);
			sb.append(_strArray(Array.get(o, i), depth - 1));
		}
		return sb.toString();
	}

	static void pr(Object... os) {
		boolean isFirst = true;
		for (Object o : os) {
			if (!isFirst)
				out.print(" ");
			out.print(o);
			isFirst = false;
		}
	}

	static void ln() {
		out.println();
	}

	static void ln(Object... os) {
		for (Object o : os) {
			pr(o);
			ln();
		}
	}
}