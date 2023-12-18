import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		ArrayList<Ab> taka = new ArrayList<>();
		ArrayList<Ab> aoki = new ArrayList<>();
		Ab tmp;
		for (i = 0; i < n; i++) {
			tmp = new Ab(parseLong(sc.next()), parseLong(sc.next()));
			taka.add(tmp);
			aoki.add(tmp);
		}
		sc.close();
		Collections.sort(taka, new Comparator<Ab>() {
	        @Override
	        public int compare(Ab s1, Ab s2) {
	        	if(s2.a != s1.a) {
		            return (int)s2.a - (int)s1.a;
	        	} else {
		            return (int)s2.b - (int)s1.b;
	        	}
	        }
	    });
//		out.println(taka.toString());
		Collections.sort(aoki, new Comparator<Ab>() {
	        @Override
	        public int compare(Ab s1, Ab s2) {
	        	if(s2.b != s1.b) {
		            return (int)s2.b - (int)s1.b;
	        	} else {
		            return (int)s2.a - (int)s1.a;
	        	}
	        }
	    });
//		out.println(aoki.toString());
		long takac = 0;
		long aokic = 0;
		int takap = 0;
		int aokip = 0;
		for (i = 0; i < n; i++) {
			while(taka.get(takap).f)takap++;
			while(aoki.get(aokip).f)aokip++;
			if(i%2==0) {
				if(taka.get(takap).a>=aoki.get(aokip).b) {
					takac+=taka.get(takap).a;
					taka.get(takap).f = true;
					takap++;
				} else {
					takac+=aoki.get(aokip).a;
					aoki.get(aokip).f = true;
					aokip++;
				}
			} else {
				if(aoki.get(aokip).b>=taka.get(takap).a) {
					aokic+=aoki.get(aokip).b;
					aoki.get(aokip).f = true;
					aokip++;
				} else {
					aokic+=taka.get(takap).b;
					taka.get(takap).f = true;
					takap++;
				}
			}
		}
		out.println(takac-aokic);
	}
}
class Ab {
	long a;
	long b;
	boolean f;
	Ab(long a, long b) {
		this.a = a;
		this.b = b;
		this.f = false;
	}
	@Override
	public String toString() {
		return "a:" + a + ",b:" + b + ",f:" + f; 
	}
}
