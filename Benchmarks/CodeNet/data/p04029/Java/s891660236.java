import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		int sum = 0;
		
		for(int i = 0 ; i < N ; i++){
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		sc.close();
		
		int aver = sum / N;
		
		int value = calculateDiff(arr, aver);
	
		value = Math.min( calculateDiff(arr, aver + 1), value );
		
		System.out.println(value);
	}

	static int calculateDiff(int[] arr, int aver) {
		int diff = 0;
		
		for(int i = 0 ; i < arr.length ; i++){
			diff += ((arr[i] - aver) * (arr[i] - aver));
		}
		
		return diff;
	}
}
