import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		LinkedList<Integer> inputs = new LinkedList<>();

		for(int i=0;i < n;i++) {
			inputs.add(sc.nextInt());
		}
		Collections.sort(inputs);

		double beforeParam = inputs.pop();
		for(int i=0;i < n - 1;i++) {
			beforeParam = (beforeParam + inputs.pop()) / 2;
		}

		System.out.println(beforeParam);

	}
}