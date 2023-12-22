import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int sumAmount = 0;
		float numAvarage = 0;
		int numCount = 0;
		while(stdIn.hasNext()){
			String[] temp = stdIn.next().split(",");
			sumAmount += Integer.valueOf(temp[0]) * Integer.valueOf(temp[1]);
			numAvarage += Integer.valueOf(temp[1]);
			numCount++;
		}
		numAvarage /= numCount;
		System.out.println(sumAmount +"\n" + Math.round(numAvarage));
	}
}