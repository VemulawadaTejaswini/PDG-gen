import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		// input
		final int NUM = scan.nextInt();
		List<Integer> powers = new ArrayList<>();
		for(int i = 0; i < NUM*3; i++){
			powers.add(Integer.parseInt(scan.next()));
		}
		
		// sort
		Collections.sort(powers, Comparator.reverseOrder());

		// search
		long sum = 0;
		int count = 0;
		for(int i = 1; count < NUM; i += 2){
			sum += powers.get(i);
			count++;
		}
		
		// answer
		System.out.println(sum);
		
	}
}