import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int count =1;
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
			count *=3;
		}
		int no = 1;
		for (int i=0;i<N;i++) {
			if (A[i]%2==0) {
				no *=2;
			}
		}
		System.out.println(count -no);
	}
}