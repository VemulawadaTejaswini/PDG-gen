import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]= new int[201];
		for (int i=1;i<200;i++) {
			a[i] ++;
		}
		for (int i=3;i<200;i+=2) {
			for (int j=1;j*i<200;j+=2) {
				a[i*j]++;
			}
		}
		int N =sc.nextInt();
		int count =0;
		for (int i=1;i<=N;i++) {
			if (a[i]==8) {
				count ++;
			}
		}
		System.out.println(count);
	}
}