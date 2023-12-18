import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		String S=stdIn.next();
		long e[]=new long[N+1];
		long w[]=new long[N+1];
		int z=0;
		long y=0,x=0;
		while(z<N){
			if(S.charAt(z)=='W')
				y++;
			if(S.charAt(N-z-1)=='E')
				x++;
			w[z+1]=y;e[N-z-1]=x;
			z++;
		}z=0;y=0;x=3*100000;
		while(z<N-1){
			y=w[z]+e[z+2];
			if(y<x)
				x=y;
			z++;
		}
		System.out.println(x);
	}
}