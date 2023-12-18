import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		
		Scanner cin = new Scanner(System.in);
		
		int A = cin.nextInt();
		int B = cin.nextInt();
		int C = cin.nextInt();
		int tmp = 0;
		String result = "YES";
		
		tmp = A%B;
		if(C%tmp!=0){
			result = "NO";
		}
		
		System.out.println(result);
	}
}
