import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		TreeSet<Integer> set=new TreeSet<>();
		int n=in.nextInt();
		for(int i=0;i<n;i++) {
			set.add(Integer.parseInt(in.next()));
		}
		
		int m=in.nextInt();
		
		for(int i=0;i<m;i++) {
			set.remove(Integer.parseInt(in.next()));
		}
		
		PrintWriter out=new PrintWriter(System.out);
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext()) {
			out.println(itr.next());
		}
		out.flush();
	}

}
