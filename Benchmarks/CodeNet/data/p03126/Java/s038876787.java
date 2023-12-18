import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		int M=sc.nextInt();

		int[] food=new int[M];

		for(int i=0;i<N;i++) {
			int J=sc.nextInt();
			for(int j=0;j<J;j++) {
				int inputFood=sc.nextInt()-1;
				food[inputFood]++;
			}
		}

		int cnt=0;

		for(int i=0;i<M;i++) {
			if(food[i]==N) cnt++;
		}

		System.out.println(cnt);

		sc.close();

	}

}
