import java.util.*;

public class Main {
	public int WaterMoney ( int water ) {
		int cost = 0;
		water -= 10; cost += 1150;
		while ( water > 0 ) {
			if ( water <= 10 ) cost += 125;
			else if ( water <= 20 ) cost += 140;
			else cost += 160;
			water--;
		}
		return cost;
	}
	
	public static void main ( String[] args ) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		while ( !sc.hasNext("-1") ) {
			int use = sc.nextInt();
			System.out.println(4280-m.WaterMoney(use));
		}
	}
}