import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int M=scan.nextInt();
		int A[]=new int[N];
		String coment="No";
		int total=0;
		for(int i=0;i<N;i++){
			A[i]=scan.nextInt();
		}
		for(int i=0;i<N;i++){
			total+=A[i];
		}
		int count=0;
		double border=(1.0/(4.0*M))*total;
		for(int i=0;i<N;i++){
			if(A[i]>=border){
				count++;
			}
		}
		if(count>=M){
			coment="Yes";
		}
		System.out.println(coment);

	}

}
