import java.util.*;
import static java.lang.Integer.parseInt;
class Main{
	static			Scanner		s		= new Scanner(System.in);

	static	final	String		divide	= "####################";
	static			int[][][]	h		= new int[4][3][10];

	public static void main(String[] args){
		s.next();
		while (s.hasNext()) {
			h[parseInt(s.next())-1][parseInt(s.next())-1][parseInt(s.next())-1]+=parseInt(s.next());
		}
		output();
	}
	static void output() {
		for(int j=0;j<h.length;j++) {
			int[][] hh = h[j];
			for (int[] hhh : hh) {
				for (int hhhh:hhh) {
					System.out.printf(" %d",hhhh);
				}
				System.out.println();
			}
			if(j!=3)
			System.out.println(divide);
		}
	}
}