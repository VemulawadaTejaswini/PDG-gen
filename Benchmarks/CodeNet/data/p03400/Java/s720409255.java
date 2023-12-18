import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int D=sc.nextInt();
		int X=sc.nextInt();
		int A[]=new int[N];
		int a=N+X;
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			for(int k=1;A[i]*k+1<=D;k++) {
				a=a+1;
			}
		}
		System.out.println(a);
	}
}