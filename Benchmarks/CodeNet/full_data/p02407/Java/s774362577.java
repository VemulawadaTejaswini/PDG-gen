import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] number = new int[n];
		for(int i = 0; i < n; i++){
			int a = scan.nextInt();
			number[i] = a;
		}

		for(int i = n - 1; i >= 0; i--){
			System.out.print(number[i]);
			if(i != 0){
				System.out.print(" ");
			} else{
				System.out.println("");
			}
		}
	}
}