
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int M = in.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
//		ArrayList<ArrayList<Integer>> m = new ArrayList<ArrayList<Integer>>();
		
		int price = Integer.MAX_VALUE;
		int a_min = Integer.MAX_VALUE;
		int b_min = Integer.MAX_VALUE;
		
		for(int i=0; i<A; i++) {
			int temp = in.nextInt();
			a.add(temp);
			a_min = Math.min(a_min, temp);
		}
		for(int i=0; i<B; i++) {
			int temp = in.nextInt();
			b.add(temp);
			b_min = Math.min(b_min, temp);
		}
		for(int i=0; i<M; i++) {
//			ArrayList<Integer> c = new ArrayList<Integer>();
			int x = in.nextInt();
			int y = in.nextInt();
			int c = in.nextInt();
//			m.add(c);
			price = Math.min(price, a.get(x-1)+b.get(y-1)-c);
		}
		
		System.out.print(Math.min(price,a_min+b_min));
	}
	
}
