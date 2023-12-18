import java.util.Scanner;

class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt() {return Integer.parseInt(s.next());}
	static long gLong() {return Long.parseLong(s.next());}

	public static void main(String[]$){
		int n=gInt()-1,c[]=new int[n],s[]=new int[n],f[]=new int[n];
		for(int i=0;i<n;++i) {
			c[i]=gInt();
			s[i]=gInt();
			f[i]=gInt();
		}
		for(int i=0;i<n;++i) {
			int sum=0;
			for(int j=i;j<n;++j) {
				sum=Math.max(sum,s[j]);
				sum=(sum+f[j]-1)/f[j]*f[j];
				sum+=c[j];
			}
			System.out.println(sum);
		}
		System.out.println(0);
	}
}