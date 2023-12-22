import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		TreeSet<Integer> set=new TreeSet<>();
		int n=in.nextInt();
		for(int i=0;i<n;i++) {
			set.add(in.nextInt());
		}
		
		int m=in.nextInt();
		PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<m;i++) {
			int obj=in.nextInt();
			if(set.contains(obj))out.println(obj);
		}
		out.flush();
	}

}

