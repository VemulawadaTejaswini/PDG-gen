import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int[] array = new int[] {stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt()};
		
		Arrays.parallelSort(array);    // 5 5 7 になっていれば正解
		
		System.out.println(Arrays.equals(array,new int[] {5,5,7}) ? "YES":"NO");
		
		
	}

}
