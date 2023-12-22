import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++){
			array[i] = scan.nextInt();
		}
		
		for(int j = 0; j < n / 2; j++){
			int a = array[j];
			array[j] = array[n - j - 1];
			array[n - j - 1] = a;
		}
		
		for(int k = 0; k < n; k++){
			System.out.print(array[k]);
			if(k == n - 1){
				System.out.println();
				break;
			}
			System.out.print(" ");
		}
	}
}