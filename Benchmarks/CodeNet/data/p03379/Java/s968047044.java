import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0;i < N; i++){
			numbers.add(sc.nextInt());
		}
		ArrayList<Integer> c_numbers = new ArrayList<Integer>();
		for(int j = 0;j<N;j++){
			c_numbers = (ArrayList<Integer>) numbers.clone();
			c_numbers.remove(j);
			Collections.sort(c_numbers);
			System.out.println(c_numbers.get(N/2-1));
		}
	}

}
