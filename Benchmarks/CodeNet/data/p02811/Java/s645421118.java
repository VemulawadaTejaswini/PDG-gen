import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int k = sc.nextInt();
			int x = sc.nextInt();
			
			System.out.println(k*500 >= x ? "Yes": "No");
		}
	}
}