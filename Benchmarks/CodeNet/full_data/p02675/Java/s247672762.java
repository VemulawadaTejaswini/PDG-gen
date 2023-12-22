import java.util.Scanner;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int y = x % 10;
		
		switch(y){
			case 2:
			case 4:
			case 5:
			case 7:
			case 9: System.out.println("hon"); break;
			case 0:
			case 1:
			case 6:
			case 8: System.out.println("pon"); break;
			case 3: System.out.println("bon"); break;
		}
		
	}

}