import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[] a = new int[k];
		for(int i = 0 ; i < k ; i++) a[i] = sc.nextInt();
		int max = -1001001001;
		int min = 1001001001;
		for(int i = 2 ; i < 10000000 ; i++) {
			int temp = i;
			for(int j = 0 ; j < k ; j++) {
				temp = temp - temp % a[j];
			}
			if(temp == 2) {
				max = Math.max(max, i);
				min = Math.min(min, i);
			}
		}
		if(max == -1001001001 || min == 1001001001) {
			System.out.println(-1);
		} else {
			System.out.println(min + " " + max);
		}
	}
}
