import java.util.Scanner;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();

		int money = 100;
		int day = 0;
		
		do {
			money += money/100;
			day += 1;
		}while(money < X);
		
		System.out.println(day);
		
	}

}