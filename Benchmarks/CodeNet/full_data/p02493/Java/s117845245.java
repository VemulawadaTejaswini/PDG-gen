import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);
		
		int n = num.nextInt();
		int a[] = new int[1000];
		
		for (int i = 0; i < n; i++){
			a[i] = num.nextInt();
		}
		
		for (int i = n - 1; i >= 0; i--){
			if (i == 0) System.out.printf("%d", a[i]);
			else System.out.printf("%d ", a[i]);
		}
		System.out.println();
	}
}