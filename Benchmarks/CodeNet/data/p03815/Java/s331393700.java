import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		long x = scan.nextLong();

		long  count = 0;
		while(true){
			x -= 6;
			count ++;
			if(x <= 0){
				break;
			}
			x -= 5;
			count ++;
			if(x <= 0){
				break;
			}
		}
		System.out.println(count);
	}
}
