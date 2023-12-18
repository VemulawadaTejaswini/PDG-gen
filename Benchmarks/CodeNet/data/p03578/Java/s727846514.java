import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		boolean possible = true;
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		ArrayList<Integer> available = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			available.add(input.nextInt());
		}
		
		int M = input.nextInt();
		ArrayList<Integer> problems = new ArrayList<Integer>();
		for(int i = 0; i < M; i++) {
			problems.add(input.nextInt());
		}
		
		for(int i = 0; i < problems.size(); i++) {
			if(available.contains(problems.get(i))){
				available.remove(available.indexOf(problems.get(i)));
			}
			else {
				possible = false; 
				break;
			}
		}
		if(possible)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
