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
			Playerr[] ppl = new Playerr[n];
			for (int i = 0; i < n; i++) {
				ppl[i] = new Playerr(si(),si()*60+si()+si()*60+si()+si()*60+si()+si()*60+si());
			}
			Arrays.sort(ppl);
			out.println(ppl[0].id);
			out.println(ppl[1].id);
			out.println(ppl[n-2].id);
		}
		out.flush();
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}

class Playerr implements Comparable<Object> {
	int id,rec;
	Playerr(int p,int q){
		id=p;rec=q;
	}
	@Override
	public int compareTo(Object o) {
		return this.rec-((Playerr)o).rec;
	}

}