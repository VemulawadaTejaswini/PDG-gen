import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];		
		for(int i = 0;i<N;i++) {
			 a[i] = sc.nextInt();			
		}
		int sum = 0;
		for(int i = 0;i<N-1;i++) {
			for(int j = i+1;j<N;j++) {
				sum += a[i]*a[j];
			}
		}
		System.out.println(sum);
	}
}
