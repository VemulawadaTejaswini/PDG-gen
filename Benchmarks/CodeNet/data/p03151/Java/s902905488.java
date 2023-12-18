import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i=0;i<n;i++) a[i] = in.nextInt();
		for(int i=0;i<n;i++) b[i] = in.nextInt();
		List<Integer> enough = new ArrayList<>();
		List<Integer> shortage = new ArrayList<>();
		long shortage_sum = 0;
		for(int i=0;i<n;i++) {
			if(a[i]-b[i]>0) enough.add(a[i]-b[i]);
			else if(a[i]-b[i]<0) {
				shortage.add(a[i]-b[i]);
				shortage_sum += -a[i]+b[i];
			}
		}
		if(shortage_sum==0) System.out.println(0);
		else {
			enough.sort((x,y)->-x+y);
			int i=0;
			for(;i<enough.size();i++) {
				shortage_sum -= enough.get(i);
				if(shortage_sum<=0) break;
			}
			if(i==enough.size()) System.out.println(-1);
			else System.out.println(shortage.size()+i+1);
		}
		
		in.close();

	}

}
