import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		List <Integer> M = new ArrayList<Integer>();
		List <Integer> F = new ArrayList<Integer>();
		List <Integer> R = new ArrayList<Integer>();
		int m;
		int f;
		int r;
		do {
			m = stdIn.nextInt();
			f = stdIn.nextInt();
			r = stdIn.nextInt();
			M.add(m);
			F.add(f);
			R.add(r);
		} while (m != -1 || f != -1 || r != -1);
		
		
		for(int i = 0; i < M.size()-1; i++) {
			if(M.get(i) == -1 || F.get(i) == -1) {
				System.out.println("F");
			}
			else {
				int tmp = M.get(i) + F.get(i);
				if(tmp >= 80) {
					System.out.println("A");
				}
				else if (tmp >= 65) {
					System.out.println("B");
				}
				else if (tmp >= 50) {
					System.out.println("C");
				}
				else if(tmp >= 30) {
					if(R.get(i) >= 50) {
						System.out.println("C");
					}
					else {
						System.out.println("D");
					}
				}
				else {
					System.out.println("F");
				}
			}
		}
	}
}