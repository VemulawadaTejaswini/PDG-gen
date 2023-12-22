import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int num = sc.nextInt();
			if (num == -1) {
				break;
			}
			int price = 1150;

			if(num > 10){
				for (int i = 11; i <= num; i++) {
					if(i > 30){
						price += 160;
					}else if (i > 20) {
						price += 140;
					}else if(i > 10 ){
						price += 125;
					}
				}
			}
			System.out.println(4280 - price);

		}
	}

}