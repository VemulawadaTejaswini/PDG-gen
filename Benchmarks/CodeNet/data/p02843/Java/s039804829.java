import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		int price = scan.nextInt();

		// check
		int nums = price / 100;
		int tail = price % 100;
		boolean flag = false;
		for(int i = 0; i < nums; i++){
			if(tail >= 5){
				tail -= 5;
			} else if(tail >= 4){
				tail -= 4;
			} else if(tail >= 3){
				tail -= 3;
			} else if(tail >= 2){
				tail -= 2;
			} else if(tail >= 1){
				tail -= 1;
			}
			if(tail == 0){
				flag = true;
				break;
			}
		}

		// answer
		if(flag){
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}
}
