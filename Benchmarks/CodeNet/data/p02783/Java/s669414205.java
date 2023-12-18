import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		for(int i = sc.nextInt(); i >= 0; i = i - sc.nextInt()){
			count++;
		}
		
		System.out.println(count);
		
	}

}
