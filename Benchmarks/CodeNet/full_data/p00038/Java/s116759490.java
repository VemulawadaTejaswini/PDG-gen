import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(scan.hasNext()){
			String[] cards = scan.next().split(",");
			int[] a = new int[5];
			for (int i = 0; i < 5; i++)
				a[i] = Integer.parseInt(cards[i]);
			Arrays.sort(a);
			if(pair(a).contains(4)) out.println("four card");
			else if(pair(a).contains(3) && pair(a).contains(2)) out.println("full house");
			else if(a[4]-a[0]==4 || (a[0]==1 && a[1]==10 && a[4]==13)) out.println("straight");
			else if(pair(a).contains(3)) out.println("three card");
			else if(pair(a).lastIndexOf(2)==1) out.println("two pair");
			else if(pair(a).contains(2)) out.println("one pair");
			else out.println("null");
		}
		out.flush();
	}

	static ArrayList<Integer> pair(int[] a){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 13 ; i++) {
			int tmp=0;
			for (int j = 0; j < 5; j++) if(a[j]==i) tmp++;
			if(tmp>=2) list.add(tmp);
		}
		return list;
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}