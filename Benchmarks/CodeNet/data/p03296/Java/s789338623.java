import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int count = 0;
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int i = 1;
		do {
			if(a[i] == a[i-1]){
				count++;
				i++;
			}
			i++;
		} while(i < n);
		System.out.println(count);
	}
}