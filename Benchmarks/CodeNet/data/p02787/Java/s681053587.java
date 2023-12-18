import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;

public class Main {

	static BufferedReader reader;
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		String[] HN = readLine();
		int H = Integer.parseInt(HN[0]);
		int N = Integer.parseInt(HN[1]);
		Map<Float,Attack> atks = new TreeMap<>();
		for(int i=0;i<N;i++) {
			String[] t = readLine();
			int a = Integer.parseInt(t[0]);
			int m = Integer.parseInt(t[1]);
			Attack att;
			if((att = atks.get((float)a/m))!=null) {
				if(att.m>m) {
					atks.put((float)a/m,new Attack(a,m));
				}
			}else {
				atks.put((float)a/m,new Attack(a,m));
			}
			
		}
		int Nn = atks.size();
		Attack[] atk = new Attack[Nn];
		Set<Float> ks = atks.keySet();
		Iterator<Float> ki = ks.iterator();
		for(int i=0;i<Nn;i++) {
			atk[Nn-i-1] = atks.get(ki.next());
		}
		
		int[] dpt = new int[H+1];
		Arrays.fill(dpt,Integer.MAX_VALUE);
		dpt[0] = 0;
		for(int i=0;i<Nn;i++) {
			Attack a = atk[i];
			for(int h=1;h<=H;h++) {
				int from = Math.max(0,h-a.a);
				if(dpt[from]+a.m<dpt[h]) {dpt[h]=dpt[from]+a.m;}
			}
		}
		print(dpt[H]);
		
		//String[] s = readLine();
		//print(num);
	}
	
	//functions here
	//note that all methods should be STATIC
	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
	private static long lcm(long m, long n) {
	    return m * n / gcd(m, n);
	}
	private static String[] readLine(){
		try{
			return reader.readLine().split(" ");
		}catch(Exception e){
			e.printStackTrace();
			return new String[]{e.getMessage()};
		}
	}
	private static void print(Object o){
		System.out.println(o);
	}
	private static void print(){
		System.out.println();
	}
}

class Attack{
	int a;
	int m;
	
	public Attack(int a, int m){
		// TODO 自動生成されたコンストラクター・スタブ
		this.a = a;
		this.m = m;
	}
	public String toString() {
		return a+"-"+m;
	}
}

class AttackNode{
	Attack atk;
	AttackNode parent;
	AttackNode[] child;
	int Hleft;
	int M;
	
	public AttackNode(Attack atk){
		// TODO 自動生成されたコンストラクター・スタブ
		this.atk = atk;
		this.child = null;
	}
	public void generateChilds(Attack[] atks) {
		float c = (float)atk.a/atk.m;
		child = new AttackNode[atks.length];
		for(int i=0;i<atks.length;i++) {
			if(c*atks[i].m<atks[i].a) {continue;}
			child[i] = new AttackNode(atks[i]);
			child[i].parent = this;
		}
	}
	public String toString() {
		if(parent==null) {return atk.toString();}
		else {return parent.toString()+"->"+atk.toString();}
	}
}
