import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();
		
		int min = X - K + 1;
		int max = X + K -1;
		LinkedList<Integer> ansSet = new LinkedList<Integer>();
		
		for(int i = min; i <= X; i++) {
			ansSet.add(i);
		}
		
		for(int i = X + 1; i <= max; i++) {
			ansSet.add(i);
		}
		
		for (int result : ansSet) {
			System.out.print(String.join(result + " "));
		}
		
		sc.close();
	}
}
