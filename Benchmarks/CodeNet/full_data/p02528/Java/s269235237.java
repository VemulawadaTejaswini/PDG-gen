import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int[] array;
		int n;
		
		n = stdIn.nextInt();
		array = new int[n];
		
		for (int i = 0; i < n; i++){
			array[i] = stdIn.nextInt();
		}
		for (int i = 0; i < n - 1; i++){
			for (int j = 0; j < n - i - 1; j++){
				if (array[j] > array[j + 1]){
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
		
		System.out.print(array[0]);
		for (int i = 1; i < n; i++){
			System.out.print(" " + array[i]);
		}
		System.out.println();
	}
}