import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			
			int[] array = new int[n + m];
			for(int i = 0; i < array.length; i++){
				array[i] = sc.nextInt();
			}
			
			Arrays.sort(array);
			
			int before = array[0];
			int min = Integer.MIN_VALUE;
			for(int i = 1; i < array.length; i++){
				int cur = array[i];
				if(min < (cur - before)){
					min = cur - before;
				}
				
				before = cur;
			}
			
			if(array.length == 1){
				min = array[0];
			}
			
			System.out.println(min);
		}
		
	}

}