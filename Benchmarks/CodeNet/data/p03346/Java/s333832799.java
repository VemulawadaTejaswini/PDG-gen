import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = 0;
		int current = N;
		for (int i = N - 1; i  >= 0 ; i--) {
			if (arr[i] == current) {
				current--;
			} else ans++;
		}
		System.out.println(ans);
	}
}
