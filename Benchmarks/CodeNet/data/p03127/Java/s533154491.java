import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();

		int[] M=new int[N];

		for(int i=0;i<N;i++) M[i]=sc.nextInt();

		Arrays.sort(M);

		int min=M[0];
		int index=0;

		for(int i=0;i<N-1;i++) {
			if(min>Math.abs(M[i+1]-M[i])) {
				index=i+1;
				min=Math.abs(M[i+1]-M[i]);
			}
		}

		if(index==0) System.out.println(M[index]);
		else System.out.println(calc(M[index-1],M[index]));

		sc.close();
	}

	public static int calc(int a,int b) {
		if(a<b) {
			int w=a;
			a=b;
			b=w;
		}
		if(a-b==0) return a;
		else  return calc(a-b,b);
	}

}
