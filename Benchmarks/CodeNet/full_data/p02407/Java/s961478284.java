import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int a[] = new int[n];

		for(int i = 0; i < n; i++){
			a[i] = scan.nextInt();
		}

		for(int j = n - 1; j > 0; j--){
			System.out.print(a[j]);
			System.out.print(" ");
		}
	}
}