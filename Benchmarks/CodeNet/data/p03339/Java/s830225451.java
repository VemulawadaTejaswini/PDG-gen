import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String args[]) {
		ArrayList<String> direction = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int np = sc.nextInt();
		String d = sc.next();
		
		for(int i = 0; i < np; i++) {
			direction.add(d.substring(i, (i+1)));
		}
		
		TreeSet<Integer> change = new TreeSet<>();
		
		for(int i = 0; i < np; i++) {
			int cc = 0;
			for(int n = 0; n < np; n++) {
				if(n < i) {
					if(direction.get(n).equals("W")) {
						cc++;
					}
				}
				
				if(n > i) {
					if(direction.get(n).equals("E")){
						cc++;
					}
				}
			}
			
			change.add(cc);
		}
		
		System.out.println(change.first());
	}
}