import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		TreeSet<Integer> a = new TreeSet<Integer>();
		
		String s;
		for(int i=0;i<10;i++)
				a.add(Integer.parseInt(br.readLine()));

		System.out.println(a.pollLast());
		System.out.println(a.pollLast());
		System.out.println(a.pollLast());
		
	}
}