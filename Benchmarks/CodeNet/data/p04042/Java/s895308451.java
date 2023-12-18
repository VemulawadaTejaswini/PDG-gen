import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.nextInt();
		int K = sc.nextInt();

		String[] dic1 = new String[K+1];
		String[] dic2 = new String[K+1];
		dic1[0] = "";
		
		for(int i=0; i<N/2; i++) {
			String s = sc.next();
			int L = s.length();
			for(int j=K-L; j>=0; j--) {
				if(dic1[j]!=null) {
					String joined = dic1[j]+s;
					if(dic1[j+L]==null || joined.compareTo(dic1[j+L])<0)
						dic1[j+L] = joined;
				}
			}
		}
		dic2[0] = "";
		for(int i=N/2; i<N; i++) {
			String s = sc.next();
			int L = s.length();
			for(int j=K-L; j>=0; j--) {
				if(dic2[j]!=null) {
					String joined = dic2[j]+s;
					if(dic2[j+L]==null || joined.compareTo(dic2[j+L])<0)
						dic2[j+L] = joined;
				}
			}
		}
		String ans = null;
		for(int i=0; i<K; i++)
			if(dic1[i]!=null && dic2[K-i]!=null && (ans==null || ans.compareTo(dic1[i]+dic2[K-i])>0))
				ans = dic1[i]+dic2[K-i];
		
		pw.println(ans);

		sc.close();
		pw.close();
	}
	
}
