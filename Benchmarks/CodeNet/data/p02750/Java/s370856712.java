
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int T = in.nextInt();
		ArrayList<int[]> list = new ArrayList<int[]>();
//		ArrayList<Integer> total = new ArrayList<Integer>();
		int time = 1;
		int count = 0;
		for(int i=0; i<N; i++) {
			int[] temp = new int[3];
			temp[0] = in.nextInt();
			temp[1] = in.nextInt();
			temp[2] = temp[0]*time+temp[1];
			list.add(temp);
		}
		while(time<T+0.5) {
			Collections.sort(list, comparator);
			time += list.get(0)[2];
			if(time>T+0.5) break;
			count++;
			list.remove(0);
			if(list.size()==0) break;
			for(int i=0; i<N; i++) {
				int[] temp = list.get(0);
				temp[2] = temp[0]*time+temp[1];
			}
		}
		System.out.print(count);
	}
	static Comparator<int[]> comparator = new Comparator<int[]>() {
		@Override
		public int compare(int[] a, int[] b) {
			if( a[2] <= b[2]) return -1;
			else return 1;
		}
	};
	
}
