import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N;
		N=scan.nextInt();
		int A[]=new int[N];
		int B[]=new int[N];
		int i,j;
		for(i=0;i<N;i++){
			A[i]=scan.nextInt();
			B[A[i]-1]=i+1;
		}
		for(i=0;i<N;i++){
			System.out.print(B[i]+" ");
		}
		
		
	}
}