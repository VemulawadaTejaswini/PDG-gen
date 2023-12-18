import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		int max = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++) {
				if(i == j) {
					continue;
				}
				if(array[j] > max) {
					max = array[j];
				}
			}
			System.out.println(max);
			max = 0;
		}
	}

}