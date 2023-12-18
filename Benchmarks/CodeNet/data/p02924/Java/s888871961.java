import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

import java.io.PrintWriter;

public class Main {
	static int[] ans;
	static ArrayList<ArrayList<Integer>> ab;
	static HashMap<Integer, Integer> px = new HashMap<>(); 

	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		sc.close();
		int ans = n*(n-1)/2;
		out.println(ans);
	}
}
