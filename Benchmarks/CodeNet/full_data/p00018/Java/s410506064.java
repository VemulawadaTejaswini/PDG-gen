import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> seq = new ArrayList<Integer>(5);
		for(int i=0;i<5;i++) {
			seq.add(sc.nextInt());
		}
		Collections.sort(seq, Collections.reverseOrder());
		System.out.print(seq.get(0));
		for(int i=1;i<5;i++) {
			System.out.print(" " + seq.get(i));
		}
		System.out.println();
	}

}