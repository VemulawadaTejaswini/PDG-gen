
import java.util.*;

public class Main {
		public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
			int N = input.nextInt();
			int[] arr = new int[N];
			for(int i = 0; i < N ; i++){
				arr[i] = input.nextInt();
			}
			
			Arrays.sort(arr);
			int biggest = 0;
			int nextBiggest = 0;
			boolean found = false;
			for(int i = arr.length-1; i > 0; i--){
				if(!found && arr[i] == arr[i-1]){
					biggest = arr[i];
					found = true;
				}
				if(found && arr[i] == arr[i-1] && arr[i] != biggest){
					nextBiggest = arr[i];
					break;
				}
			}
				//System.out.println(biggest + " " + nextBiggest);
				System.out.println(biggest * nextBiggest);
			
		}
}