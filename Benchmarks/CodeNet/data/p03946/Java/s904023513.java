

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, t, a[], min, max, max2 = 0, count = 0;
		
		n = sc.nextInt();
		t = sc.nextInt();
		a = new int[n];
		
		for(int i = 0; i < n; ++i)a[i] = sc.nextInt();
		
		min = a[0];
		max = a[0];
		for(int i = 0; i < n; ++i) {
			if(max == a[i] && i!= 0)continue;
			if(min < a[i] && max > a[i])continue;
			max = a[i];
			min = a[i];
			for(int j = i + 1; j < n; ++j) {
				max = Math.max(max, a[j]);
			}
			if(max != a[i]) {
				if(max2 < max - a[i]) {
					max2 = max - a[i];
					count = 1;
				}
				else if(max2 == max - a[i])++count;
			}	
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
