import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] compare = new int[n];
		for(int i = 0;i<n;i++) {
			int temp = sc.nextInt();
			arr[i]=temp;
			compare[i] = temp;
		}
		int count = 0;
		Arrays.sort(compare);
		for(int i = 0;i<n;i++) {
			if(arr[i]!=compare[i])count++;
		}
		System.out.println(count>2?"NO":"YES");

	}

}
