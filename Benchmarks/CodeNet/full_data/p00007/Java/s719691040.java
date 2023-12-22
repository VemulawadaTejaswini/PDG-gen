import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, debt = 100000;
		
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			 debt *= 1.05;
			 if(debt % 1000 != 0){
				 debt += 1000 - debt % 1000;
			 }
		}
		
		System.out.println(debt);
	}
}