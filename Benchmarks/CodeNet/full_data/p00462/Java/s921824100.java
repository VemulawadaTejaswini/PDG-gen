
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		while(in.hasNext())new AOJ0539().doIt();
	}
	
	class AOJ0539{
		int d,n,m;
		ArrayList<Integer> list;
		void doIt(){
			d = in.nextInt();
			if(d==0)return;
			n = in.nextInt();
			m = in.nextInt();
			list = new ArrayList<Integer>();
			list.add(0);
			for(int i=0;i<n-1;i++)list.add(in.nextInt());list.add(d);
			Collections.sort(list);
//			System.out.println(list);
			long result = 0;
			for(int i=0;i<m;i++){
				int b = (in.nextInt()%d);
//				System.out.println(b);
				int q = Collections.binarySearch(list, b);
				if(q<0)q = ~q;
//				System.out.println(q);
				long min = Math.min(Math.abs(list.get(q)-b), Math.abs(list.get(q-1)-b));
				result += min;
//				System.out.println();
			}
			System.out.println(result);
		}
	}
	
}