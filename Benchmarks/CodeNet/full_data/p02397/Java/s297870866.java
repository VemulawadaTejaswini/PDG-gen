import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		for(;;){
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();

			if(num1 == 0 && num2 ==0){
				scan.close();
				break;
			}
			else{
				if(num1 <= num2){
					System.out.println(num1 + " " + num2);
				}
				else if(num2 < num1){
					System.out.println(num2 + " " + num1);
				}
			}
		}
	}

}