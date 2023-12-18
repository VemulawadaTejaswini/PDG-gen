import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j,l;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		String s = "";
		HashMap<String, Integer> map = new HashMap<>();
		for (i = 0; i < n; i++) {
			s = sc.next();
			if(map.get(s)==null) {
				map.put(s, 1);
			} else {
				map.put(s, map.get(s)+1);
			}
		}
		out.println(map.size());
	}
}
