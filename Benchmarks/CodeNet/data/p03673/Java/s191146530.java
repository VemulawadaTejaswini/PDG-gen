import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = in.nextInt();
		
		LinkedList<Integer> b = new LinkedList<Integer>();
		for(int i = 0; i < n; i++) {
			if(i % 2 != n % 2) b.addFirst(a[i]);
			else b.addLast(a[i]);
		}
		
		for(int j = 0; j < b.size()-1; j++) {
			System.out.print(b.get(j) + " ");
		}
		System.out.println(b.get(b.size()-1));
	}
}