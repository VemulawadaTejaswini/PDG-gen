import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int temp;

		for(int i=0;;i++){
			a = scan.nextInt();
			b = scan.nextInt();

			if(a == 0 & b == 0){
				break;
			}

			temp = a;
			a = b;
			b = temp;

			System.out.println(a + " " + b);
		}
	}
}