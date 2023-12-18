import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int data[] = new int[n];
		int min = 1000000;
		int max = 0;

		for (int i = 0;i<n ;i++ ) {
			data[i] = sc.nextInt();
			max = Math.max(max,data[i]);
		}

		for (int i = 1;i<max ;i++ ) {
			int sum = 0;
			for (int j = 0;j<n ;j++ ) {
				sum = sum + (data[j]-i)*(data[j]-i);
			}
			min = Math.min(min,sum);
		}

		System.out.println(min);



	}
}
