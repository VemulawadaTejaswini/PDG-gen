
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// the simulation of the round robin scheduler
public class Main {
	// log in the order of termination
	public static void simulate(Queue<Integer> budgets, int q, String[] names ) {
		int global_timer = 0;
		boolean [] present = new boolean[names.length]; //false means exist
		
		int i = 0; //the current name and running mapping
		int budget, time_consumpt;
		while(!budgets.isEmpty()) {
			if(!present[i]) {
				budget = budgets.remove();
				time_consumpt = Math.min(budget, q);
				budget -= time_consumpt;
				if(budget == 0) {
					present[i] = true;
					System.out.println(names[i]+" "+ (global_timer + time_consumpt));
				}else {
					budgets.add(budget);
				}
				global_timer += time_consumpt;
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