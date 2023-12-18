import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		if(N>=M) {
			System.out.println(0);
			System.exit(0);
		}
		int x[]=new int[M];

		for(int i=0;i<M;i++) {
			x[i]=sc.nextInt();
		}
		Arrays.sort(x);
		int l[]=new int[M-1];
		for(int i=0;i<M-1;i++) {
			l[i]=x[i+1]-x[i];
		}
		int length=x[M-1]-x[0];
		Arrays.sort(l);
		for(int i=0;i<N-1;i++) {
			length=length-l[M-2-i];
		}
		System.out.println(length);
	}
}