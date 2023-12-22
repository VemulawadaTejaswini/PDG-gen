import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int date;

		Scanner scan = new Scanner(System.in);

		date = scan.nextInt();

		for(int i = 0 ; i < date ;i++){
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			num3 = scan.nextInt();

			if(num3 * num3 == num2*num2+num1*num1){
				System.out.println("YES");

			}else{
				System.out.println("NO");
			}
		}

	}

}