package test;

public class Main{

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int count = 0;

		for (int index=0; index<N; index++) {
			if (sc.nextInt()>=K) {
				count++;
			}
		}

		System.out.println(count);
	}
}