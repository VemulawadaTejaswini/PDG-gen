import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lengthFirst = scanner.nextInt();
		int lengthSecond = scanner.nextInt();
		int maximum = scanner.nextInt();
		int result = 0;
		int[] books1 = new int[lengthFirst];
		int[] books2 = new int[lengthSecond];
		
		for(int i = 0; i < lengthFirst; i++)
			books1[i] = scanner.nextInt();
		for(int i = 0; i < lengthSecond; i++)
			books2[i] = scanner.nextInt();

			result = updatePosition(books2, books1, maximum);
		System.out.println(result);
	}

	private static int checkPosition(int[] books2, int position2, int[] books1, int position1, int maximum) {
		if(maximum - books1[position1] < 0)
			return 0;
		else 
			return updatePosition(books2, position2 + 1, books1, position1 + 1, maximum);
	}

	private static int updatePosition(int[] books2, int position2, int[] books1, int position1, int maximum) {
		int lengthFirst = books1.length;
		int lengthSecond = books2.length;
		int result = 0;
		int sum = 0;
		for(int i = 0; i < lengthFirst + lengthSecond; i++) {
			if(books1[position1] > books2[position2]) {
				sum += books2[position2];
				position2++;
				if(position2 == lengthSecond) {
					books2[0] = (int) 1e9 + 1;
					position2 = 0;
				}
			}
			else if(books1[position1] < books2[position2]) {
				sum += books1[position1];
				position1++;
				if(position1 == lengthFirst) {
					books1[0] = (int) 1e9 + 1;
					position1 = 0;
				}
			}
			else if(books1[position1] == books2[position2]) {
				result += checkPosition(books2, position2, books1, position1, maximum - sum - books1[position1]);
				break;
			}
			
			if(sum > maximum)
				break;
			result++;
		}
		return result;
	}

	private static int updatePosition(int[] books2, int[] books1, int maximum) {
		int position1 = 0;
		int position2 = 0;
		int lengthFirst = books1.length;
		int lengthSecond = books2.length;
		int result = 0;
		int sum = 0;
		for(int i = 0; i < lengthFirst + lengthSecond; i++) {
			if(books1[position1] > books2[position2]) {
				sum += books2[position2];
				position2++;
				if(position2 == lengthSecond) {
					books2[0] = (int) 1e9 + 1;
					position2 = 0;
				}
			}
			else if(books1[position1] < books2[position2]) {
				sum += books1[position1];
				position1++;
				if(position1 == lengthFirst) {
					books1[0] = (int) 1e9 + 1;
					position1 = 0;
				}
			}
			else if(books1[position1] == books2[position2]) {
				result += checkPosition(books2, position2, books1, position1, maximum - sum);
			}
			
			if(sum > maximum)
				break;
			result++;
		}
		return result;
	}
}
