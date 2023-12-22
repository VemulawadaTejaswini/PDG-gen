import java.util.Scanner;

public class Main{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N =sc.nextInt();

		Long A[] =new Long[N];

		for(int i=0; i<N; i++) {
			A[i]=sc.nextLong();
		}

		Long result = 0L;
		for(int i=0; i<N;i++) {
			for(int j =i+1; j<N; j++) {
				result += A[i]*(A[j]) % 1000000007L;
			}
		}

		result = result % 1000000007L;
		System.out.println(result);

		sc.close();
	}

}
