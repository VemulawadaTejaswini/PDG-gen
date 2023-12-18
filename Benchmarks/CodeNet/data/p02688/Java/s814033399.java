import java.util.Scanner;
public class Main{
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	int N=scan.nextInt();
	int K=scan.nextInt();
	int A[]=new int[N];
	for(int i=0;i<N;i++) {
		A[i]=0;
	}
	for(int i=0;i<K;i++) {
	int d=scan.nextInt();
		for(int j=0;j<d;j++) {
			int m=scan.nextInt();
			A[m-1]=1;
		}
	}
	int num=0;
	for(int i =0;i<N;i++) {
		if(A[i]==0) {
		num++;
		}
		else {}
	}
	System.out.println(num);
	}
}
