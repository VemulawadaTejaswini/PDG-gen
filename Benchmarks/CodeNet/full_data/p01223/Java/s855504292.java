import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nData = sc.nextInt();
		
		for(int i = 0; i < nData; i++) {
			int n = sc.nextInt();
			int up = 0;
			int down = 0;
			int now = sc.nextInt();
			for(int j = 0; j < n-1; j++) {
				int h = sc.nextInt();
				if(h > now) {
					if(up < h-now) {
						up = h-now;
					}
				}
				else if(h < now) {
					if(down < now-h) {
						down = now-h;
					}
				}
				now = h;
			}
			System.out.println(up + " " + down);
		}
	}
}