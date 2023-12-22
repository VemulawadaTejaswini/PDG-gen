import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N=sc.nextInt();
		long[] a=new long[N];
		long B=0;
		for(int i=0;i<N;i++) {
			a[i]=sc.nextLong();
			B^=a[i];
		}
		for(int i=0;i<N;i++) System.out.println(B^a[i]);
	}
}