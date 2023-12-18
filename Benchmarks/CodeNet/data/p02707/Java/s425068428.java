import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); //社員数
		int A[] = new int[N-1]; //直属の上司

		for(int i=0; i<(N-1); i++) {
			A[i] = sc.nextInt();
		}
		int count[] = new int[N]; //部下の人数のリスト

		for(int n=0; n<(N-1); n++) {
				count[A[n]-1]++;
		}

		for(int c : count) {
			System.out.println(c);
		}
	}

}
