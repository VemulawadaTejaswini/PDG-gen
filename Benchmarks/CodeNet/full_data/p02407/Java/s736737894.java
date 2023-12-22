import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		
		int one[];
		int i;
		
		int a = scan.nextInt();
		one = new int[a];
		
		for(i=a-1; i>=0; i--){
			int num = scan.nextInt();
			one[i] = num;
		}

		for(i=0; i<a; i++){
			System.out.print(one[i]);
			if(i != a-1){
				System.out.print(" ");
			}
		}
		
	}
}