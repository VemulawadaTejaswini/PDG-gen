import java.util.Scanner;

class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int numberOfPeople = sc.nextInt();
		int day = sc.nextInt();
		int remainingNumber = sc.nextInt();

		int eatCount = 0;
		
		for(int i = 0; i < numberOfPeople; i++) {
			eatCount += 1;
			int eatDay = sc.nextInt();
			int nextEatDay = 1 + eatDay;
			for(int d = 0; d <= day; d++) {
				if(d == nextEatDay) {
					eatCount += 1;
					nextEatDay += eatDay;
				}
			}
		}
		System.out.println(eatCount + remainingNumber);
	}
}