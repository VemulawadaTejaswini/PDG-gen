import java.util.Scanner;

class Main {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int n;
		n = input.nextInt();
		
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++){
			a[i] = input.nextInt();
		}
		
		
		for (int i = 0; i < n - 1; i++){
			int min = i;
			for (int j = i + 1; j < n; j++){
				if (a[min] > a[j])min = j;
			}
			int dam;
			dam = a[i];
			a[i] = a[min];
			a[min] = dam;
			
		}
		
		for (int i = 0; i < n; i++){
			System.out.print(a[i]);
			if (i != n - 1)System.out.printf(" ");
			else System.out.println();
			
		}
	}
}