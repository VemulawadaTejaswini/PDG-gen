import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 1;
		
		while(true) {
			if(count%N*count==0 && N*count%2==0) {
				System.out.println(count);
				break;
			}
			count++;
		}
		

	}

}