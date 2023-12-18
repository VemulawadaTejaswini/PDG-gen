import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 1;
		
		while(true) {
			if(count%N==0 && count%2==0) {
				System.out.println(count);
				break;
			}
			count++;
		}
		

	}

}