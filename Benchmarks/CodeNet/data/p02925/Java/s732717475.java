import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		ArrayList[] a = new ArrayList[n];
		for ( int r = 0; r < n; r++ ) {
			a[r] = new ArrayList<Integer>();
			for ( int c = 0; c < n - 1; c++ ) {
				a[r].add(in.nextInt());
			}
		}

		for(int i = 0; i< n ; i++) {
			Integer temp = (Integer)a[i].get(a[i].size() -1);
			if(temp == null) continue;
			for(int j = 0; j< n ; j++) {
				if(i == j)continue;
				Integer last = (Integer)a[j].get(a[j].size() -1);
				if(last == null) continue;
				if(temp == last) {
					a[i].remove(a[i].size() -1);
					a[j].remove(a[j].size() -1);
				}
			}			
		}
		
		for(int i = 0; i< n ; i++) {
			if(a[i].size() != 0) {
				System.out.println("-1");
				return;
			}
		}
		System.out.println(n);
		in.close();
	}
}
