//package reedeka;
import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		if(n%2==0) {
			int x, i;
			int firsthalf = 0, secondhalf = 0;
			for(i=1; i<=n; i++) {
				x = sc.nextInt();
				if(i<=(n/2)) firsthalf += x;
				else secondhalf += x;
			}
			System.out.println(Math.abs(firsthalf-secondhalf));
		}
		else {
			int firsthalf = 0, secondhalf = 0, mid = 0;
			int i, x;
			for(i=0; i<n; i++) {
				x = sc.nextInt();
				if(i<(n/2)) firsthalf += x;
				else if(i==(n/2)) mid = x;
				else secondhalf += x;
			}
			if(Math.abs((firsthalf+mid)-secondhalf)>Math.abs((secondhalf+mid)-firsthalf)) {
				System.out.println(Math.abs((secondhalf+mid)-firsthalf));
			}
			else {
				System.out.println(Math.abs((firsthalf+mid)-secondhalf));
			}
		}
	}
}
