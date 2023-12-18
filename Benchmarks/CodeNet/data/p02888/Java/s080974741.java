import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[n];
		long count = 0;
		for(int i = 0; i < n; i++)
			l[i] = sc.nextInt();
		Arrays.parallelSort(l);
		for(int i = n-1; i >= 2; i--) {
			for(int a = i-1; a >= 1; a--) {
				for(int b = a-1; b >= 0; b--) {
					if(l[i] < l[a]+l[b]) {
						count++;
					}else {
						break;
					}
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}