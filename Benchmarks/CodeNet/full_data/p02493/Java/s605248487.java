import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);
		
		int n = num.nextInt();
		int a[] = new int[1000];
		
		for (int i = 0; i < n; i++){
			a[i] = num.nextInt();
		}
		
		for (int i = 0; i < n - 1; i++){
			for (int j = n - 1; j > i; j--){
				if (a[j-1] < a[j]){
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < n; i++){
			if (i == n - 1) System.out.printf("%d", a[i]);
			else System.out.printf("%d ", a[i]);
		}
		System.out.println();
	}
}