import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(scan.nextInt());
		set.add(scan.nextInt());
		set.add(scan.nextInt());
		
		System.out.println(set.size()==2?"Yes":"No");
		
	}
}