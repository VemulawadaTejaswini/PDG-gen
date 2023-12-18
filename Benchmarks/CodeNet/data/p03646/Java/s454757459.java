

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();

		int n = 50;

		long sum = k/n;
		long amari = k%n;

		long a[] = new long[50];
		for(int i=0; i<n; i++) {
			a[i]=i+sum;
		}
		for(int i=0; i<amari; i++) {
			a[n-1-i]++;
		}
		System.out.println(n);
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + (i==n-1 ? "\n" : " "));
		}
		sc.close();
	}


}

