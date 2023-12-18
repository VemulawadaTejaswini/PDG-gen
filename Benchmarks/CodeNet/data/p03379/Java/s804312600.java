import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class Main{
	
	public static void main(String[] args) throws IOException{
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		ArrayList<int[]> list1 = new ArrayList<>();
		for(int i = 0; i < N; i++){
			int index = i;
			int x = in.nextInt();
			int[] p = {index, x};
			list1.add(p);
		}
		Collections.sort(list1, (p1,p2)->Integer.compare(p1[1],p2[1]));
		
		ArrayList<int[]> list2 = new ArrayList<>();
		int m1 = list1.get(N / 2 - 1)[1], m2 = list1.get(N / 2)[1];
		
		for(int i = 0; i < N; i++){
			int[] p = list1.get(i);
			int index = p[0];
			int mx;
			if(i <= N / 2 - 1) mx = m2;
			else mx = m1;
			int[] pp = {index, mx};
			list2.add(pp);
		}
		Collections.sort(list2, (p1,p2)->Integer.compare(p1[0],p2[0]));
		
		for(int[] p : list2) System.out.println(p[1]);
	}
}
