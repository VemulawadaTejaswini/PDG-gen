import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 while(sc.hasNext()) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			List<Integer> A = new ArrayList<>();
			int min = Math.min(4, n);
			for(int i=0;i<min;i++)
				for(int j=0;j<min;j++) {
					if(i==j)continue;
					String aa = String.valueOf(a[i]);
					String bb = String.valueOf(a[j]);
					A.add(Integer.parseInt(aa+bb));
				}
			Collections.sort(A);
			System.out.println(A.get(2));
	  }	 
	}
}
