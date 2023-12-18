import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
//List<String> color = new ArrayList<>();
//int[] n = new int[k];

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		List<Integer> n = new ArrayList<>();
		int[] n1 = new int[4];
		for (int i = 0; i < 4; i++)
			n1[i] = stdIn.nextInt();
			
		for (int i = 0; i < 4; i++)
			n.add(n1[i]);

		if (n.contains(1)) {
			int b = n.indexOf(1);
			n.remove(b); 
		}
		if (n.contains(9)) {
			int c = n.indexOf(9);
			n.remove(c); 
		}
		if (n.contains(7)) {
			int d = n.indexOf(7);
			n.remove(d); 
		}
		if (n.contains(4)) {
			int e = n.indexOf(4);
			n.remove(e); 
		}

		if (n.isEmpty() == true) 
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}