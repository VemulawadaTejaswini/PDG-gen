import java.util.Scanner;
class Main {
	public static void main(String[] args){
		final int Number=100;
		try(Scanner sc = new Scanner(System.in)){
			int N = Integer.parseInt(sc.next());
			int[] A = new int[N];
			for(int i=0;i<N;i++)A[i]=Integer.parseInt(sc.next());
			System.out.print(A[0]);
			for(int j=1;j<N;j++)System.out.print(" "+A[j]);
			System.out.println();
			for(int i=1;i<N;i++){
				int v = A[i];
				for(int j = i-1;(j>=0)&&(A[j]>v);j--){
					A[j+1]=A[j];
					A[j]=v;
				}
				
				System.out.print(A[0]);
				for(int j=1;j<N;j++)System.out.print(" "+A[j]);
				System.out.println();
			}
		}
	}
}