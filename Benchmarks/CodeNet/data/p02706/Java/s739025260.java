import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int M=scan.nextInt();
		int A[]=new int [M];
		for(int i=0;i<M;i++){
			A[i] =scan.nextInt();
		}
		int sum=0;
		int ans=0;
		for(int i=0;i<M;i++){
			sum+=A[i];
		}
		if(N<sum){
			ans=-1;
		}else{
			ans=N-sum;
		}
		System.out.println(ans);

	}

}
