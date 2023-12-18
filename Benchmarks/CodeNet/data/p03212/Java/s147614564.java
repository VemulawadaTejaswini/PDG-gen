import java.util.Scanner;
public class Main{
	int seven = 7;
	int five = 5;
	int three = 3;
	int count = 0;
	int min = 357;
	int min_digit;
	

	int getNumOfDigits(int N, int num_digits){
		min_digit = N;
		while(true){
			min_digit = min_digit / 10;
			num_digits += 1;
			if(min_digit == 0){
				break;
			}
		}
		return num_digits;
	}

	int numOfSft(int N, int num_digits){
		boolean sevenFrag = false;
		boolean fiveFrag = false;
		boolean threeFrag = false;
		for(int i = min; i < N; i++){
			int divide = i;
			for(int j = 0; j <= num_digits; j++){
				min_digit = divide % 10;
				if(min_digit == seven) sevenFrag = true;
				else if(min_digit == five) fiveFrag = true;
				else if(min_digit == three) threeFrag = true;
				if(divide > 0 && min_digit != three && min_digit != five && min_digit != seven){
					break;
				}
				else if(divide == 0 && sevenFrag && fiveFrag && threeFrag){
					count += 1;
					break;
				}
				divide = divide / 10;
			}
			sevenFrag = false;
			fiveFrag = false;
			threeFrag = false;
		}
		return count;
	}

	public static void main(String[] args){
		Main m = new Main();
		int N;
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		int num_digits = 0;
		num_digits = m.getNumOfDigits(N, num_digits);
		System.out.println(m.numOfSft(N, num_digits));

	}


}

