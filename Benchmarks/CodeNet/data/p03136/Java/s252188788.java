import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> len = new LinkedList<Integer>();

		// input
		int num = scan.nextInt();
		for(int i = 0; i < num; i++){
			len.add(scan.nextInt());
		}

		// sort
		Collections.sort(len, Comparator.reverseOrder());
		int maxLen = len.poll();

		// sum & avg
		int sum = 0;
		while(len.size() > 0){
			sum += len.poll();
		}

		if(maxLen < sum){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}


	}
}
