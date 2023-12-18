import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}

		Arrays.sort(a);
		long min = a[0];
		int zero = 0;

		int zerok=0;
		while (a[n - 2] != 0) {

			zero = 0;
			for (int i = zerok+1; i < n; i++) {
				a[i] = a[i] % min;
				if (a[i] == 0) {
					zero++;
				}
			}
			zerok+=zero;
			Arrays.sort(a);
			//show(a);
			min = a[zerok];
		}

		System.out.println(a[n - 1]);
	}
public static void show(long a[]){
	for(int i=0;i<a.length;i++){
	System.out.print(a[i]+" ");}
System.out.println();
}
}