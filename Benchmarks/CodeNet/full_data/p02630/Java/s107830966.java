import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> sequence = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			sequence.add(sc.nextInt());
		}

		int q = sc.nextInt();
		
		for(int i = 0; i < q; i++) {
			int before = sc.nextInt();
			int after = sc.nextInt();

			for(int j = 0; j < n; j++) {
				if(sequence.get(j) == before) {
					sequence.set(j, after);
				}
			}
			
			long sum = 0;
			for(int j = 0; j < n; j++) {
				sum += sequence.get(j);
			}
			System.out.println(sum);
		}
		sc.close();
	}

}