import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);		
		int N = a.nextInt();
		int[] AArray = new int[N];
		int[] array = new int[N];
		
			for(int j = 1; j < N; j++) {
				AArray[j] = a.nextInt();
				array[AArray[j] - 1] += 1;
				
			
			}
			for(int i = 0; i < N; i++) {
			System.out.println(array[i]);
			
		}

	}
}