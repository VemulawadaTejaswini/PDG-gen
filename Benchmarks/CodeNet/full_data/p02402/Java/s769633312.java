import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int min=0, max=0, sum=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a= new int[n];
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\\s");
		for (int i=0; i < n; i++) {
			a[i] = scan.nextInt();
			if (i == 0) {
				min = a[i];
				max = a[i];
				sum = a[i];
			} else {
				if (min > a[i]) {
					min = a[i];
				}
				if (max < a[i]) {
					max = a[i];
				}
				sum += a[i];
			}
		}
		System.out.println(min + " " + max + " " + sum);
	}

}