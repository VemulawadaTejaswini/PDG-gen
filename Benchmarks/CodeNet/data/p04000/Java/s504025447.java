import java.util.*;

public class Main {
	static String N;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();
		int n = scn.nextInt();
		int n2 = scn.nextInt();
		for(int i = scn.nextInt();i>0;i--) {
			int m = scn.nextInt();
			int m2 = scn.nextInt();
			if(m<=n-2&m2<=n2-2)map.put(m+" "+m2,map.getOrDefault(m+" "+m2, 0)+1);
			if(m>1&m<=n-1&m2<=n2-2) map.put((m-1)+" "+m2,map.getOrDefault((m-1)+" "+m2, 0)+1);
			if(m>2&m2<=n2-2) map.put((m-2)+" "+m2,map.getOrDefault((m-2)+" "+m2, 0)+1);
			if(m2>1&m<=n-2&m2<=n2-1) map.put(m+" "+(m2-1),map.getOrDefault(m+" "+(m2-1), 0)+1);
			if(m2>2&m<=n-2) map.put(m+" "+(m2-2),map.getOrDefault(m+" "+(m2-2), 0)+1);
			if(m>1&m2>1&m<=n-1&m2<=n2-1) map.put((m-1)+" "+(m2-1),map.getOrDefault((m-1)+" "+(m2-1), 0)+1);
			if(m>2&m2>2) map.put((m-2)+" "+(m2-2),map.getOrDefault((m-2)+" "+(m2-2), 0)+1);
			if(m>1&m2>2&m<=n-1) map.put((m-1)+" "+(m2-2),map.getOrDefault((m-1)+" "+(m2-2), 0)+1);
			if(m>2&m2>1&m2<=n2-1) map.put((m-2)+" "+(m2-1),map.getOrDefault((m-2)+" "+(m2-1), 0)+1);
		}
		long un = 0;
		long dos = 0;
		long tr = 0;
		long qu = 0;
		long ci = 0;
		long se = 0;
		long si = 0;
		long oc = 0;
		long nu = 0;
		for (Object value : map.values()) {
		    if(value.toString().equals("1"))un++;
		    if(value.toString().equals("2"))dos++;
		    if(value.toString().equals("3"))tr++;
		    if(value.toString().equals("4"))qu++;
		    if(value.toString().equals("5"))ci++;
		    if(value.toString().equals("6"))se++;
		    if(value.toString().equals("7"))si++;
		    if(value.toString().equals("8"))oc++;
		    if(value.toString().equals("9"))nu++;
		}
		System.out.println((long)(n-2)*(n2-2)-un-dos-tr-qu-ci-se-si-oc-nu);
		System.out.println(un);
		System.out.println(dos);
		System.out.println(tr);
		System.out.println(qu);
		System.out.println(ci);
		System.out.println(se);
		System.out.println(si);
		System.out.println(oc);
		System.out.println(nu);
		scn.close();
	}
}