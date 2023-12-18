import java.util.Scanner;

public class AGC039A_ConnectionAndDisconnection {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int k=sc.nextInt();
		System.out.println(""+Process(s,k));
	}

	private static long Process(String s, int k) {
		long r;
		// TODO 自動生成されたメソッド・スタブ
		//System.out.println("sの最後の文字は"+s.substring(s.length()-1, s.length()));
		int[] p=Structur(s);
		//System.out.println("PRINT");
		if(Simple(s)) {
			r=f(k*(long)s.length());
			return r;
		}else {
			if(s.substring(0, 1).equals(s.substring(s.length()-1, s.length()))) {
				//System.out.println("print");
				return s1(k,p);
			}else {
				return s2(k,p);
			}
		}
	}

	private static long s2(int k, int[] p) {
		// TODO 自動生成されたメソッド・スタブ
		long r;
		int[] q=new int[p.length];
		for(int i=0;i<p.length;i++) {
			q[i]=(int)f(p[i]);
		}

		//System.out.println("幹部は"+(sum(q))+"");
		r=k*(long)sum(q);
		return r;
	}

	private static long s1(int k, int[] p) {
		// TODO 自動生成されたメソッド・スタブ
		long r;
		//System.out.print("pの長さ"+p.length);
		int[] q=new int[p.length-1];
		q[p.length-2]=(int)f(p[0]+p[p.length-1]);
		//System.out.println("qのおしりは定義");
		for(int i=1;i<p.length-1;i++) {
			q[i-1]=(int)f(p[i]);
		}
		//System.out.println("幹部は"+(sum(q)*k)+"");
		//System.out.println((sum(q)*k)+"-"+f(p[0]+p[p.length-1])+"+"+f(p[0])+"+"+f(p[p.length-1]));
		r=(long)sum(q)*(long)k-(long)f(p[0]+p[p.length-1])+(long)f(p[0])+(long)f(p[p.length-1]);
		return r;
	}

	private static int sum(int[] q) {
		// TODO 自動生成されたメソッド・スタブ
		int r=0;
		for(int i=0;i<q.length;i++) {
			r=r+q[i];
		}
		return r;
	}

	private static long f(long l) {
		// TODO 自動生成されたメソッド・スタブ
		if(l%2==0) {
			return l/2;
		}else {
			return (l-1)/2;
		}
	}

	private static boolean Simple(String s) {
		// TODO 自動生成されたメソッド・スタブ
		if(g(s)==s.length()) {
			return true;
		}else return false;
	}

	private static int[] Structur(String s) {
		// TODO 自動生成されたメソッド・スタブ

		String str=s;
		int l=0;
		for(int i=0;str.length()!=0;i++) {
			str=str.substring(g(str));
			//System.out.println("str="+str);
			l=i;
		}
		int[] r=new int[l+1];
		//System.out.println("l="+l+", s="+s);
		String str2=s;
		for(int i=0;str2.length()!=0;i++) {
			//System.out.println("p["+i+"]="+g(str2));
			r[i]=g(str2);
			str2=str2.substring(r[i]);
		}
		//System.out.println("PriNT");
		return r;
	}

	private static int g(String s) {
		// TODO 自動生成されたメソッド・スタブ
		int r=0;
		String h=s.substring(0, 1);
		for(int i=0;i<s.length() && h.equals(s.substring(i, i+1)) ;i++) {
			//System.out.print("i="+i);
			r=i;
		}
		//System.out.println("g(s)="+(r+1));
		return r+1;
	}

}
