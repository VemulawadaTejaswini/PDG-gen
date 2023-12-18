import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int number = Integer.parseInt(scan);
		
		int count=1;
		if (number<=6){
			System.out.println(1);
		}
		
		while(number>6){
			number = number-6;
			count++;
		}
		System.out.println(count);
		

	}

}
