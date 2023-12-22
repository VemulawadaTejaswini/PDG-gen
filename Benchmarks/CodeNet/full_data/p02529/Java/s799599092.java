import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	static int N,M,k;
	static int[] a,b;
	static int[][] f;
	static String s;
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		N = sc.nextInt();
		a = new int[N];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		N = sc.nextInt();
		b=new int[N];
		for (int i = 0; i < a.length; i++) {
			b[i]=sc.nextInt();
		}
		
//		M = sc.nextInt();
//		k = sc.nextInt();
//		s=sc.next();

		f=new int[N][N];
		StringBuffer sb=new StringBuffer();

		Arrays.sort(a);

		Arrays.sort(b);
		int cnt=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j])cnt++;
			}
		}
		System.out.println(cnt);

	}

}