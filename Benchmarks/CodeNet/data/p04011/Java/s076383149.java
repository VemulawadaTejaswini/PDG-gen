import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int span = sc.nextInt();
		int period = sc.nextInt();
		int cost1 = sc.nextInt();
		int cost2 = sc.nextInt();
		int total = 0;
		
		if((span - period) >= 0)
		total = period * cost1 + (span - period) * cost2;
		else 
		total = span * cost1;
		System.out.println(total);
	}
}
