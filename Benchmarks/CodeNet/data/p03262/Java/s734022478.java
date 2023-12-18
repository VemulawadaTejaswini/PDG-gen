import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

public class Main{

	// a < b
	public static int eukleides(int a, int b){
		if(b % a == 0){
			return a;
		}
		int mod = b % a;
		
		return eukleides(mod, a);
	}

	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> points = new LinkedList<>();
		LinkedList<Integer> distances = new LinkedList<>();
		int answer;
		int min = Integer.MAX_VALUE;
		
		// input
		final int NUM = scan.nextInt();
		for(int i = 0; i <= NUM; i++){
			points.add(scan.nextInt());
		}
		
		// sort
		Collections.sort(points);
		
		// check distance
		while(points.size() > 1){
			distances.add((points.poll() - points.peek()) * -1);
		}
		
		// sort
		Collections.sort(distances);
		
		while(distances.size() > 1){
			distances.addFirst(eukleides(distances.poll(), distances.poll()));
		}
		
		System.out.println(distances.poll());
		
		
		

	}
}