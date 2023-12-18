import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		char[] l = new char[n];
		char[] r = new char[n];
		for(int i=0;i<n;i++) {
			l[i] = s.charAt(i);
			r[i] = s.charAt(2*n-1-i);
		}
		char[][] buf = new char[2][n];
		long count = 0;
		for(int i=0;i<(1<<n);i++) {
			int[] p = new int[2];
			for(int j=0;j<n;j++) {
				int k = (i>>j)&1;
				buf[k][p[k]++] = l[j];
			}
			int ptr0 = 0;
			int ptr1 = 0;
		    count += calc(buf,r,ptr0,ptr1,p);
		}
		System.out.println(count);
		in.close();
	}
	
	public static long calc(char[][] buf,char[] r,int ptr0,int ptr1,int[] p) {
		if(ptr0==p[0] && ptr1==p[1]) return 1;
		int ptr = ptr0 + ptr1;
		long count = 0;
		if(ptr0<p[0] && buf[0][ptr0]==r[ptr]) {
			count += calc(buf,r,ptr0+1,ptr1,p);
		}
		if(ptr1<p[1] && buf[1][ptr1]==r[ptr]) {
			count += calc(buf,r,ptr0,ptr1+1,p);
		}
		return count;
	}


}