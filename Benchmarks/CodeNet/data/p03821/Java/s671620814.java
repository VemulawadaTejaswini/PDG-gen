import java.util.*;
public class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int n=s.nextInt();
		long in[][]=new long[n][2];
		long buf[] =new long[n];
		long result=0;
		for(int i=0;i<n;i++) {
			in[i][0]=s.nextInt();
			in[i][1]=s.nextInt();

			buf[i]=in[i][1]-in[i][0]%in[i][1];
		}
		System.out.println(Arrays.toString(buf));
		for(int i=n-1;i>=0;--i) {
			buf[i]-=result;
			while(buf[i]<0)
				buf[i]+=in[i][1]*500000000;
			buf[i]%=in[i][1];
			result+=buf[i];
		}
		System.out.println(result);
	}
}