import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int kaisu = 3;
		int[] num = new int[kaisu];

		for(int i = 0; i < kaisu ; i++) {
			num[i] = scan.nextInt();
		}
		num = up_down_sort(num);
		for(int i = 0 ; i < kaisu ; i++) {
			if(i != kaisu - 1) System.out.print(num[i] + " ");
			else System.out.println(num[i]);
		}
	}
	
	public static int[] up_down_sort (int[] numbers) {
		int up_number ;
		int down_number ;
		int yousosu = numbers.length;
		for(int i = yousosu-1 ; i >= 0 ; i--) {
			for(int j = i ; j <= yousosu  ; ++j) {
				if(j+1 == yousosu) break;
				if(numbers[j] < numbers[j+1]) {
					break;
				}
				if(numbers[j] > numbers[j+1]) {
					up_number = numbers[j+1];
					down_number = numbers[j];
					numbers[j] = up_number;
					numbers[j+1] = down_number;
				}
			}
		}
		return numbers;
	
		/*else System.out.println("No");
		if(a < b) System.out.println("a < b");
		else if(a > b) System.out.println("a > b");
		else System.out.println("a == b");
		int[] time_get = henkan(scan.nextInt());
	
		for(int i = 0; i < 3; i++) {
			if(i != 2) System.out.print(time_get[i] + ":" );
			else System.out.println(time_get[i]);
		}

	}

	static int[] henkan(int time_input) {
		int[] times = new int[3];
		times[0] = time_input / 3600;
		time_input = time_input - times[0] * 3600;
		times[1] = time_input /60;
		times[2] = time_input - times[1] * 60;
		
		return times;*/
	}
}