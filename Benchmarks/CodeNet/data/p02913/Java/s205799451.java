
import java.util.*;
import java.io.PrintWriter;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int res = 0;
    	for (int i = 0; i < n; ++i) {
        	String T = s.substring(i,n);
        	int[] lcp = Zalgo(T);

			for (int j = 0; j < T.length(); ++j) {
            	int l = Math.min(lcp[j], j);
            	res = Math.max(res, l);
        	}
		}
		System.out.println(res);
	}
	static int[] Zalgo(String T){
		char[] S=T.toCharArray();
		int N = S.length;
    	int[] res=new int[N];
    	res[0] = N;
    	int i = 1, j = 0;
    	while (i < N) {
        	while (i+j < N && S[j] == S[i+j]) ++j;
        	res[i] = j;
        	if (j == 0) {++i; continue;}
        	int k = 1;
        	while (i+k < N && k+res[k] < j) {res[i+k] = res[k]; ++k;}
        	i += k; j -= k;
    	}
    	return res;
	}
}

