import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(true){
			int n = si();
			if(n==0) break;
			Team[] tm = new Team[n];
			for (int i = 0; i < n; i++) {
				String s = scan.next();
				int wp = 0,lp = 0;
				for (int j = 0; j < n-1; j++) {
					int tmp = si();
					if(tmp==0) wp++;
					if(tmp==1) lp++;
				}
				tm[i] = new Team(s,wp,lp,i);
			}
			Arrays.sort(tm);
			for (int i = 0; i < n; i++) {
				out.println(tm[i].name);
			}
		}
		out.flush();
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}

class Team implements Comparable<Object> {
	String name;
	int wp,lp,no;
	Team(String p,int q, int r,int s){
		name = p; wp = q;lp = r;no = s;
	}

	public int compareTo(Object o){
		if(this.wp!=((Team)o).wp) return -( this.wp-((Team)o).wp );
		else if(this.lp!=((Team)o).lp) return this.lp-((Team)o).lp;
		else return this.no - ((Team)o).no;
	}
}