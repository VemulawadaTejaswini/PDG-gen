import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int M=scan.nextInt();
		int A[]=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=scan.nextInt();
		}
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				if(A[i]<A[j]) {
					int temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
		int total=0;
		for(int i=0;i<N;i++) {
			total+=A[i];
		}
		boolean flag=true;
		for(int i=0;i<M;i++) {
			if((double)A[i]<(double)(total/(4*M))) {
				flag=false;
			}
		}
		if(flag) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
