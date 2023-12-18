import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int [N];
		int B[]=new int [N];
		int a=0;
		int b=0;
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
			B[i]=A[i];
		}
		while(b==0) {
			for(int i=0;i<N;i++) {
				if(A[i]%2==0) {
					B[i]=A[i]/2;
				}else {
					b=1;
				}
				a=a+1;
			}
		}
		System.out.println(a);
	}
}