import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N;
		N=scan.nextInt();
		int A[]=new int[N];
		int i,j;
		for(i=0;i<N;i++){
			A[i]=scan.nextInt();
		}
		int B[]=new int[N];
		for(i=0;i<N;i++){
			B[i]=i+1;
		}
		int min,minindex,temp;
		for(i=0;i<N-1;i++){
			min=A[i];
			minindex=i;
			for(j=i+1;j<N;j++){
				if(min>A[j]){
					min=A[j];
					minindex=j;
				}
			}
			temp=A[i];
			A[i]=A[minindex];
			A[minindex]=temp;
			temp=B[i];
			B[i]=B[minindex];
			B[minindex]=temp;
		}
		for(i=0;i<N;i++){
			System.out.print(B[i]+" ");
		}
	}
}