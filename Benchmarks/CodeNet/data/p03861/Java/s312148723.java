import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		Scanner s = new Scanner(System.in);
		
		String[]split =f.readLine().split("\\s+");
		long a=Long.parseLong(split[0]), b = Long.parseLong(split[1]), x = Long.parseLong(split[2]);
		if(x == 1) {
			System.out.println(b-a+1);
		} else {
			int res = 0;
			for(long i = x; i <= b; i+=x) {
				if(i >= a) res++;
			}
			System.out.println(res);
		}
	}
}