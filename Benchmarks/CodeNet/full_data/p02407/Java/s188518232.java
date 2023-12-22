import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = 0, i = 0;
        int[] arr = new int[n];
        if(n <= 100){
        for(i = 0;i < n ;i++){
        	x = scan.nextInt();
        	if(0 <= x && x < 1000){
        	arr[i] = x;
        	}
        }
        for(i = n-1;i >= 0;i--){
        System.out.print(arr[i]);
        if( i > 0){
        System.out.print(" ");
        }
        }System.out.println();
               
 }
		
		
		}
}	
			
		
	
		
		



		