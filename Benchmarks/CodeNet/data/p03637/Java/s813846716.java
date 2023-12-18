import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		boolean val = false;
		long[] arr = new long[N];
		for(int i = 0; i < N; i++){
			arr[i] = input.nextInt();
		}
		for(int i = 0; i < arr.length; i++){
			for(int j = i; j < arr.length; j++){
				if(arr[i] * arr[j] % 4 == 0){
					System.out.println("Yes");
					val = true;
					break;
				}
			}
			
			if(val == true){
				break;
			}
		}
		
		if(val == false){
			System.out.println("No");
		}
	}
}
