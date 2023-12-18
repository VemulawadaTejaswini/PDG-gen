
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num_count = sc.nextInt();

		int[] array = new int[num_count];

		int first_plus_cost = 0;
		int sum = 0;

		for(int i = 0;i < num_count;i++){
			array[i] = sc.nextInt();
		}

		for(int i = 0;i < num_count;i++){
			int temp = sum;
			temp += array[i];

			if(i % 2 == 0 && temp <= 0){
				int cost = 1 - temp;
				first_plus_cost += cost;
				temp += cost;
			}else if(i % 2 == 1 && temp >= 0){
				int cost = 1 + temp;
				first_plus_cost += cost;
				temp -= cost;
			}

			sum = temp;
		}

		int second_plus_cost = 0;
		sum = 0;
		for(int i = 0;i < num_count;i++){
			int temp = sum;
			temp += array[i];

			if(i % 2 == 0 && temp >= 0){
				int cost = 1 + temp;
				second_plus_cost += cost;
				temp -= cost;
			}else if(i % 2 == 1 && temp <= 0){
				int cost = 1 - temp;
				second_plus_cost += cost;
				temp += cost;
			}

			sum = temp;
		}

		int min_cost = first_plus_cost < second_plus_cost ? first_plus_cost : second_plus_cost;
		System.out.println(min_cost);

		sc.close();
	}

}
