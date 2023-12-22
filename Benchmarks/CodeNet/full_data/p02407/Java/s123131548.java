import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++){
			array[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n / 2; i++){
			int temp = array[i];
			array[i] = array[n - i - 1];
			array[n - i - 1] = temp;
		}
		
		for (int i = 0; i < n; i++){
			System.out.print(!(i == n - 1)? array[i] + " " : array[i]);
		}
	}
}