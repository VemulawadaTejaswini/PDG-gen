import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] num = new int[n];
		for(int i=0;i<n;i++){
			num[i] = scan.nextInt();
		}
		Arrays.sort(num);
		
		for(int i:num){
			System.out.print(i+" ");
		}
	}
}