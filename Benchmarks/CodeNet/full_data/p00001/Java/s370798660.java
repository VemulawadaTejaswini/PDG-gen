import java.util.Arrays;

public class Main {

	public static void main(String[] a){
		int size = a.length;
		int[] arr = new int[size];

		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(a[i]);
		}
		Arrays.sort(arr);

		for(int i = 1; i <= 3; i++){
			System.out.println(arr[size - i]);
		}

	}
}