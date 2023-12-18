import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] org_X = new int[N];
		int[] sort_X = new int[N];
		
		for(int i = 0 ; i < N ; i++){
			org_X[i] = scan.nextInt();
			sort_X[i] = scan.nextInt();
		}
		Arrays.sort(sort_X);
		
		if( N%2 == 1 ){
			System.out.println("input error");	
		}
		else if( N == 2 ){
			System.out.println(org_X[1]);
			System.out.println(org_X[0]);
		}
		else{
			for(int index = 0 ; index < N ; index++){
				
				if (org_X[index] <= sort_X[N/2] ){
					System.out.println(sort_X[N/2+1]);		
				}
				else {
					System.out.println(sort_X[N/2]);			
				}
			}	
		}
	}
}
