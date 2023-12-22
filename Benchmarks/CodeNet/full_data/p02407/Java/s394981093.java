import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		
		int one[];
		int i;
		
		int a = scan.nextInt();
		one = new int[a];
		
		for(i=0; i<a; i++){
			int num = scan.nextInt();
			one[i] = num;
		}

		for(i=a-1; i>=0; i--){
			System.out.print(one[i]);
			if(i != 0){
				System.out.print(" ");
			}
		}
		System.out.println();
		
	}
}