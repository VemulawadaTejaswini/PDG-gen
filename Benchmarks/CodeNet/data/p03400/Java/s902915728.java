import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
                int a[] = new int[10]; 
		int n = sc.nextInt(); 
		int d = sc.nextInt(); 
		int x = sc.nextInt(); 
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			for(int j = 1; j <= d; j = j+a[i]) {
				sum++;
			}
		}
		System.out.println(x+sum);
	}
}