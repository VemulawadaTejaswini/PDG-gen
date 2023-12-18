import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double mix =0;
		double sum =0;
		int y=0;
		double a[] = new double [N];
		for(int i = 0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		sum = (a[0]+a[1])/2;
		for(int b=2;b<N;b++) {
			sum=(sum+a[b])/2;
		}
		System.out.println(sum);
	}

}
