import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		int[] num = new int[101];
		TreeMap<Integer, Integer> sr = new TreeMap<Integer, Integer>();
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < 100 ; i++) {
			String[] input = scan.next().split(",");
			if(input[0].equals("0")) break;
			num[Integer.parseInt(input[0])]=Integer.parseInt(input[1]);
			set.add(Integer.parseInt(input[1]));
		}
		for (int i = 0,j = set.size(); i < j; i++) {
			sr.put(set.pollLast(),i+1);
		}
		while(scan.hasNext()){
			out.println(sr.get(num[si()]));
		}
		out.flush();
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}