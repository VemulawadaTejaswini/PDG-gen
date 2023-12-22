

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] in = sc.nextLine().split(" ");

		int cut = Integer.parseInt(in[1]);
		Queue<Integer> qu = new LinkedList<Integer>();
		Queue<String> quname = new LinkedList<String>();
		for (int n = 0; n <Integer.parseInt(in[0]); n++) {
			String[] in2 = sc.nextLine().split(" ");
			quname.offer(in2[0]);
			qu.offer(Integer.parseInt(in2[1]));
			
		}
		
		int time = 0;
		while (!qu.isEmpty()) {
			String name=quname.poll();
			int n = qu.poll();
			if (n-cut > 0) {
				quname.offer(name);
				qu.offer(n-cut);
				
				time += cut;
			} else {				
				time += n;
				System.out.println(name+" "+time);
			}
		}
	}

}

