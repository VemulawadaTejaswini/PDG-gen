

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	        
		int k = sc.nextInt();
		int n = sc.nextInt();
		int a[] = new int[n];

		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		
		int dist = k;
		
		// 出発する家を一軒すつ変えていく
		// 1軒目
		if(a[1]-a[0] < a[0]+(k-a[n-1]))
			dist = a[n-1]-a[0];
		else
			dist = k-(a[1]-a[0]);
		
		// 2軒目〜(n-1)軒目
		for(int i=1;i<n-1;i++) {
			if(a[i]-a[i-1] < a[i+1]-a[i]) {
				if(k-(a[i]-a[i-1]) < dist)
					dist = k-(a[i]-a[i-1]);
			}
			else {
				if(k-(a[i+1]-a[i]) < dist)
					dist = k-(a[i+1]-a[i]);
			}
		}
		
		// n軒目
		if(a[0]+(k-a[n-1]) < a[n-1]-a[n-2]) {
			if(k-(a[n-1]-a[n-2]) < dist)
				dist = k-(a[n-1]-a[n-2]);
		}
		else {
			if(a[n-1]-a[0] < dist)
				dist = a[n-1]-a[0];
		}
		
		
		System.out.println(dist);
	}
}
