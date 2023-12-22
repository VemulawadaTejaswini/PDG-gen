
import static java.lang.System.*;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

public class Main {

	public void run() {
		while (true) {
			String m=sc.next();
			if (m.equals("0"))return;
			char[] c = (m+"").toCharArray();
			int len=c.length;
			int[] mmap=new int[len];
			for(int i=0;i<len;i++){
				mmap[i]=c[i]-'0';
				if(i%2==1)mmap[i]*=-1;
			}

			int[][] dp=new int[len+1][11];
			for(int i=0;i<len;i++){
				//induction
				for(int j=0;j<11;j++)
					dp[i+1][(j+mmap[i]+11)%11]+=dp[i][j];

				//new
				if(mmap[i]%11!=0)dp[i+1][(mmap[i]+11)%11]++;
			}

			int res=0;
			for(int i=1;i<len+1;i++)res+=dp[i][0];
			ln(res);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	static Scanner sc = new Scanner(in);

	// output lib
	static final String br = System.getProperty("line.separator");
	static final String[] asep = new String[] { "", " ", br, br + br };

	static String str(Boolean o) {
		return o ? "YES" : "NO";
	}

	// static String str(Double o){
	// return String.format("%.8f",o);
	// }
	static <K, V> String str(Map<K, V> map) {
		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		for (Entry<K, V> set : map.entrySet()) {
			if (!isFirst)
				sb.append(br);
			sb.append(str(set.getKey())).append(":")
					.append(str(set.getValue()));
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
		// if(c.equals(Double.class))return str((Double)o);

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