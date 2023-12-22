import java.util.ArrayList;
import java.util.Scanner;

class SortingThreeNumbers extends ArrayList<Integer> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SortingThreeNumbers(int n1, int n2, int n3) {
		add(n1);
		add(n2);
		add(n3);
	}
	
	public SortingThreeNumbers sort() {
		sort(null);
		return this;
	}
	
	public String toString() {
		return get(0) + " " + get(1) + " " + get(2);
	}
}

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		SortingThreeNumbers sortingThreeNumbers
			= new SortingThreeNumbers(scan.nextInt(), scan.nextInt(), scan.nextInt());
		System.out.println(sortingThreeNumbers.sort().toString());
	}

}

