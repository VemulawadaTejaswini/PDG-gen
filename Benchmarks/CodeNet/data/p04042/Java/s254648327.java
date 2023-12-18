import java.util.*;
import java.io.*;

public class Main {
	static final long MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.nextInt();
		int K = sc.nextInt();

		String[] dic = new String[K+1];
		dic[0] = "";
		
		for(int i=0; i<N; i++) {
			String s = sc.next();
			int L = s.length();
			for(int j=K-L; j>=0; j--) {
				if(dic[j]!=null) {
					String s1 = dic[j]+s;
					if(dic[j+L]==null || s1.compareTo(dic[j+L])<0)
						dic[j+L] = s1;
				}
			}
		}
		
		pw.println(dic[K]);

		sc.close();
		pw.close();
	}
	
}