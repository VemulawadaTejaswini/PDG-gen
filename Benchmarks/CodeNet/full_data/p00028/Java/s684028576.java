import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		int max = 0;
		while(scan.hasNext()){
			int a = si();
			if(!map.containsKey(a)){
				map.put(a, 1);
				max = max(max,1);
			}
			else{
				int tmp = map.get(a)+1;
				map.put(a, tmp);
				max = max(max,tmp);
			}
		}
		for (Map.Entry<Integer, Integer> e : map.entrySet())
			if(e.getValue()==max) out.println(e.getKey());
		out.flush();
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}