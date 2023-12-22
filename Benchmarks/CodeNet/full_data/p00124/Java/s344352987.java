import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		int n = si();
		if(n!=0)
		while(true){
			Score[] sc = new Score[n];
			for (int i = 0; i < n; i++) {
				sc[i] = new Score(scan.next(),si(),si(),si());
			}
			Arrays.sort(sc);
			for (int i = 0; i < n; i++) {
				out.println(sc[i].str+","+sc[i].sc);
			}
			n = si();
			if(n==0) break;
			else out.println();
		}
		out.flush();
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}

class Score implements Comparable<Object> {
	String str;
	int sc;
	Score(String s,int w,int l,int t){
		str = s;
		sc = w*3+t;
	}
	@Override
	public int compareTo(Object o) {
		return -(this.sc-((Score)o).sc);
	}
}