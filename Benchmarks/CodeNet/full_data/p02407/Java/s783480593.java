import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = 0, i;
        int[] arr = new int[n];
        if(n <= 100 && 0 <= x && x < 1000){
        for(i = 0;i < n ;i++){
        	x = scan.nextInt();
        	arr[i] = x;
        	
        }
        for(i = 0;i < n ;i++){
        Arrays.sort(arr);
        System.out.print(arr[i]+" ");
        }
               
 }
		
		
		}
}	
			
		
	