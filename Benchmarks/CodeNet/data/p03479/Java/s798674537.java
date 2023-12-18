import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long x= sc.nextLong();
		Long y= sc.nextLong();
		int count = 1;
		
		while(x*2 <= y) {
			count++;
			x = x*2;
		}
		System.out.println(count);
		sc.close();

	}

}