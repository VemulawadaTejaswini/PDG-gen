import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
		String s = bw.readLine();
		int N = Integer.parseInt(s); 
		HashSet<String> set = new HashSet<String>();
		int res = 0;
		for(int i=0;i<N;i++) {
			s = bw.readLine();
			if( !set.contains(s)) {
				res++;
				set.add(s);
			}
		}
		System.out.println(res);
		bw.close();
	}
	 
	
}	

