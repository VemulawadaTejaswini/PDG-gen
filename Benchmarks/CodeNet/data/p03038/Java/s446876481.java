import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		List<Integer> al = new ArrayList<Integer>();
		for (int i =0; i<n; i++) {
			al.add(scan.nextInt()); 
		}
		for (int i =0; i<m; i++) {
			int b = scan.nextInt();
			int c = scan.nextInt();
			for(int j=0; j<b; j++) {
				al.add(c);
			}

		}
		Collections.sort(al,Comparator.reverseOrder());
		long sum=0;
		for(int i=0; i<n; i++) {
			sum += al.get(i);
		}
		System.out.println(sum);


	}
}