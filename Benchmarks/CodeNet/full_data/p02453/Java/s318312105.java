import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int n=Integer.parseInt(in.next());
		List<Integer> A=new ArrayList<>();
		for(int i=0;i<n;i++)A.add(Integer.parseInt(in.next()));
		int q=Integer.parseInt(in.next());
		
		Comparator<Integer> lower = (x, y) -> x.compareTo(y) >= 0 ? 1 : -1;
		for(int i=0;i<q;i++) {
			int key=Integer.parseInt(in.next());
			int p=~Collections.binarySearch(A, key, lower);
			if(p>=0)out.println(p);
			else out.println(n);
		}
		out.flush();
	}
}
