import java.io.PrintWriter;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		//String S = sc.next();
		//int N = Integer.parseInt(sc.next());
		//out.println();
		// ArrayList<String> list = new ArrayList<String>();
		// list.stream().sorted().distinct();
		int a[] = [1,3,5,7,8,10,12];
		int b[] = [4,6,9,11];
		int c[] = [2];
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		if((a.contains(A) && a.contains(B))
		|| (b.contains(A) && b.contains(B))
		|| (c.contains(A) && c.contains(B))){
			out.println("Yes");
		}else {
			out.println("No");
		}
		out.flush();	
	}
}