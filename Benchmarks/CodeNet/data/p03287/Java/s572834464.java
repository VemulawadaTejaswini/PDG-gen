import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		a[0] = in.nextInt()%m;
		for(int i=1;i<n;i++) {
			a[i] = (a[i-1]+in.nextInt())%m;
		}
		int[] count = new int[m];
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			count[a[i]]++;
			if(count[a[i]]==2) list.add(a[i]);
		}
		long sum = count[a[0]];
		for(int i:list) {
			sum += (count[i]*(count[i]-1))/2;
		}
		System.out.println(sum);
		in.close();
	}

}
