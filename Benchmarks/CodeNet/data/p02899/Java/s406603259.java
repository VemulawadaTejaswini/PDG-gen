import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for(int i = 0; i < a.length; i ++) {
			a[i] = sc.nextInt();
		}

		int count = 1;

	do {
		for(int i = 0; i < a.length; i++) {
			if(a[i]==count) {
				count++;
				b[i] = i+1;
				System.out.print(b[i]);
			}
		}
	}while(count!=n+1);


	}

}
