
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// the simulation of the round robin scheduler
public class Main {
	// log in the order of termination
	public static void simulate(Queue<Integer> budgets, int q, String[] names ) {
		int [] c = new int[names.length];
		boolean [] present = new boolean[names.length]; //false means exist
		
		int i = 0; //the current name and running mapping
		int budget, time_consumpt;
		while(!budgets.isEmpty()) {
			if(!present[i]) {
				budget = budgets.remove();
				time_consumpt = Math.min(budget, q);
				budget -= time_consumpt;
				for(int j = 0; j < c.length; j++) {
					c[j] += (!present[j])? time_consumpt:0;
				}

				if(budget == 0) {
					present[i] = true;
					System.out.println(names[i]+" "+c[i]);
				}else {
					budgets.add(budget);
				}
			}
			i = (i+1) % names.length;
		}
		
		

		
		return;
		
	}
	
	
	
	
	public static void main(String [] args) {
		Scanner cin = new Scanner(System.in);
		int len = cin.nextInt();
		int q = cin.nextInt();

		String [] names = new String[len];
		Queue<Integer> budgets = new LinkedList<Integer>() ;
		
		for(int i = 0; i < len; i++) {
			names [i] = cin.next();
			budgets.add(cin.nextInt());
		}
		cin.close();
		
		simulate(budgets, q, names);
		

		
	}
}