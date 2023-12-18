import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		int K=sc.nextInt();
		int X=sc.nextInt();
		int Y=sc.nextInt();

		int sum=0;
		for(int i=0;i<K;i++){
			sum=sum+X;
		}
		for(int i=K;i<N;i++){
			sum=sum+Y;
		}

		System.out.println(sum);
	}
}