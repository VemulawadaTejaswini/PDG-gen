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
		for(i=0;i<N;i++){
			for(j=0;j<N;j++){
			if(A[j]==i+1){
				System.out.print(j+1+" ");
			}
		}
		}
		
	}
}
