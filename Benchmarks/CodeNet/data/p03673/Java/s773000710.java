import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		if(n == 1) {
			System.out.println(in.next());
			return;
		}
		
		int[] b = new int[n];
		int R = 0, L = 0;
		if(n % 2 == 0) {
			R = n / 2;
			L = R - 1;
		}else {
			L = n / 2;
			R = L + 1;
		}
		
		for(int i = 0; i < n; i++) {
			int a = in.nextInt();
			if(n % 2 == i % 2) {
				b[R] = a;
				R++;
			}else {
				b[L] = a;
				L--;
			}
		}
		
		for(int j = 0; j < b.length-1; j++) {
			System.out.print(b[j] + " ");
		}
		System.out.println(b[b.length-1]);
		
		/*
		LinkedList<Integer> b = new LinkedList<Integer>();
		for(int i = 0; i < n; i++) {
			if(i % 2 != n % 2) b.addFirst(in.nextInt());
			else b.addLast(in.nextInt());
		}
		
		for(int j = 0; j < b.size()-1; j++) {
			System.out.print(b.get(j) + " ");
		}
		System.out.println(b.get(b.size()-1));
		*/
	}
}