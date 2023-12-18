import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		List<int[]> list = new ArrayList<>();
		for(int i=0;i<m;i++) {
			int[] a = new int[2];
			a[0] = in.nextInt();
			a[1] = in.nextInt();
			list.add(a);
		}
		list.sort((a1,a2)->a1[1]-a2[1]);
		int latest = 0;
		int count = 0;
		for(int[] a : list) {
			if(a[0]<=latest && latest<a[1]) continue;
			latest = a[1]-1;
			count++;
		}
		System.out.println(count);
		in.close();
	}

}
